{ pkgs ? import <nixpkgs> {} }:

pkgs.stdenv.mkDerivation rec {
  name = "mi-proyecto-spring";

  src = ./.;

  buildPhase = ''
    mkdir -p $out/config
    cp -r $src/* $out/
    echo "spring.datasource.url=jdbc:mysql://localhost:3306/sucursal?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=GMT&characterEncoding=UTF-8" > $out/config/application.properties
    echo "spring.datasource.username=root" >> $out/config/application.properties
    echo "spring.datasource.password=root" >> $out/config/application.properties
    echo "spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver" >> $out/config/application.properties
    echo "spring.jpa.show-sql=true" >> $out/config/application.properties
    echo "spring.jpa.hibernate.ddl-auto=update" >> $out/config/application.properties
    echo "spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect" >> $out/config/application.properties
    echo "spring.thymeleaf.cache=false" >> $out/config/application.properties

    echo "spring.mail.host=smtp.gmail.com" > $out/config/application-mail.properties
    echo "spring.mail.port=8080" >> $out/config/application-mail.properties
    echo "spring.mail.username=manuel.machado.j.m@gmail.com" >> $out/config/application-mail.properties
    echo "spring.mail.password=wxsieqhtqfeyetgc" >> $out/config/application-mail.properties
    echo "spring.mail.properties.mail.smtp.auth=true" >> $out/config/application-mail.properties
    echo "spring.mail.properties.mail.smtp.starttls.enable=true" >> $out/config/application-mail.properties

    echo "spring.jpa.properties.hibernate.format_sql=true" > $out/config/application-jpa.properties
  '';

  installPhase = ''
    mkdir -p $out
    cp -r * $out/
  '';

  buildInputs = [
    pkgs.openjdk11
  ];
}
