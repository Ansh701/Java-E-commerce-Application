FROM maven:3.9.6-amazoncorretto-21 AS build
WORKDIR /app

COPY java/pom.xml java/
COPY java/src java/src

WORKDIR /app/java
# Skip tests and just package the jar
RUN mvn clean package -DskipTests

FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
# Copy the jar built by Maven
COPY --from=build /app/java/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
