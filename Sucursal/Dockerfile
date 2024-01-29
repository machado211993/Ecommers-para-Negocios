FROM ubuntu:latest
LABEL authors="manue"

ENTRYPOINT ["top", "-b"]

FROM amazoncorretto:19.0.2

COPY target/Sucursales-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java" , "-jar" , "/app.jar"]