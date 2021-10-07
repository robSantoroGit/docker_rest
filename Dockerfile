FROM openjdk:11-jdk-slim as base
WORKDIR /usr/app
ADD src ./src
ADD .mvn/ ./.mvn
ADD pom.xml ./
ADD mvnw ./
RUN ["./mvnw","dependency:go-offline"]