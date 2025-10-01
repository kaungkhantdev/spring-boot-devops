FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /usr/src/app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk

WORKDIR /usr/src/app

COPY --from=builder /usr/src/app/target/*.jar /usr/src/app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

