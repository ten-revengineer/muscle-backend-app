# Build Stage
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Debug Stage
FROM alpine AS debug
COPY --from=build /app/target /target
CMD ["ls", "-l", "/target"]


# Run Stage
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/muscle-backend-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
