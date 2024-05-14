# dependency image
FROM openjdk:17-jdk-alpine as builder
WORKDIR /app/products.mongo

COPY ./pom.xml /app
COPY ../.mvn ./.mvn
COPY ./products.mongo/mvnw .
COPY ./products.mongo/pom.xml .

RUN ./mvnw dependency:go-offline 

COPY ./products.mongo/src ./src

RUN ./mvnw clean package -DskipTests

# Package image
FROM openjdk:17-jdk-alpine

WORKDIR /app

RUN mkdir ./logs

COPY --from=builder /app/products.mongo/target/products.mongo-1.0.0-SNAPSHOT.jar .

EXPOSE 8020

CMD [ "java", "-jar", "./products.mongo-1.0.0-SNAPSHOT.jar" ]
