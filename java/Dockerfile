FROM maven:3.9.6-amazoncorretto-21 AS build
WORKDIR /app

COPY java/pom.xml java/
COPY java/src java/src

WORKDIR /app/java
RUN mvn clean package -DskipTests

FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY --from=build /app/java/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
