FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/docker-app-0.0.1-SNAPSHOT.jar docker-app.jar

CMD [ "java","-jar","docker-app.jar" ]
