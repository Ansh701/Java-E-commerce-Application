FROM maven:3.9.6-amazoncorretto-21 AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean install -DskipTests

# --- Stage 2: Create the final runtime image ---
FROM amazoncorretto:21-alpine-jdk

WORKDIR /app

COPY --from=build /app/target/java-ecommerce-application-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
