{ pkgs ? import <nixpkgs> {} }:

let
  java = pkgs.openjdk19;
  maven = pkgs.maven;
in

pkgs.stdenv.mkDerivation {
  name = "mi-aplicacion-spring-boot";
  src = ./.;

  buildInputs = [
    java
    maven
  ];

  buildPhase = ''
    mvn package
  '';

  installPhase = ''
    mkdir -p $out/bin
    cp target/*.jar $out/bin/
  '';
}
