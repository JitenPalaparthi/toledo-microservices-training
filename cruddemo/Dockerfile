FROM eclipse-temurin:17-jdk-jammy as builder

# Install basic dependencies
RUN apt-get update && apt-get install -y \
    curl \
    git \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app
# if the directory is not there, it creates
# it cd that directore mkdir app && cd app

# Copy only the files needed for dependency resolution first
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .

# Download dependencies (this layer gets cached)
RUN ./mvnw dependency:go-offline

# Copy the rest of the source code
COPY src src

# Build the application with debug output
RUN ./mvnw clean package -DskipTests -X

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]