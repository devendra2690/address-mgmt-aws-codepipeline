# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/AddressManagement-0.0.1-SNAPSHOT.jar /app/AddressManagement.jar

# Expose the port that Spring Boot uses
EXPOSE 8082

# Run the jar file
ENTRYPOINT ["java", "-jar", "AddressManagement.jar"]
