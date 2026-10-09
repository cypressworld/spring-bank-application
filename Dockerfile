FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Point to your subfolder (e.g., Backend)
COPY Backend/pom.xml ./
COPY Backend/src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
