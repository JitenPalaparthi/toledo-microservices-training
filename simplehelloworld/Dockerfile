# FROM ghcr.io/graalvm/native-image:ol8-java17 AS build

# #RUN gu install native-image

# WORKDIR /app 

# COPY . .

# RUN native-image --no-fallback \
#     -H:Name=simplehelloworld \
#     -H:Class=com/spanlet/simplehelloworld/SimplehelloworldApplication \
#     -cp target/simplehelloworld-0.0.1-SNAPSHOT.jar

# FROM scratch

# COPY --from=build app/target/simplehelloworld /app/simplehelloworld

# ENTRYPOINT ["/app/simplehelloworld"]


# Use Debian-based JDK 17 (cross-platform safe)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy your built JAR file into the container
COPY target/simplehelloworld-0.0.1-SNAPSHOT.jar app.jar

# Expose the app port
EXPOSE 8080

# Launch the application
ENTRYPOINT ["java", "-jar", "app.jar"]