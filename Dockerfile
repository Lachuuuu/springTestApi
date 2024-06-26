FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

FROM eclipse-temurin:21
WORKDIR /app
COPY --from=builder /app/target/test_api-1.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]