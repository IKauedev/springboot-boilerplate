FROM maven:3.9.6-eclipse-temurin-21-alpine as build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM amazoncorretto:21.0.4-alpine3.18

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Executa o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
