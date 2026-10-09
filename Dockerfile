# Stage 1: Build stage using Maven and Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# 1. Copy pom.xml first to leverage Docker layer caching
COPY pom.xml .

# 2. Copy the rest of the source code
COPY src ./src

# 3. Build the application, skipping tests explicitly
RUN mvn clean package -DskipTests -Dmaven.test.skip=true

# Stage 2: Runtime stage
FROM eclipse-temurin:21-jdk
WORKDIR /app

# 4. Copy the compiled JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
