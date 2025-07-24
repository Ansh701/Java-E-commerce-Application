FROM maven:3.9.6-amazoncorretto-21 AS build

WORKDIR /app

COPY java/pom.xml java/

COPY java/src java/src

WORKDIR /app/java

RUN mvn clean install

FROM amazoncorretto:21-alpine-jdk

WORKDIR /app

# CORRECTED: Use the actual JAR name found in the build logs
COPY --from=build /app/java/target/java-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
