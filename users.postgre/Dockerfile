FROM openjdk:17-jdk-alpine as builder
WORKDIR /app/users.postgre

COPY ./pom.xml /app
COPY ../.mvn ./.mvn
COPY ./users.postgre/mvnw .
COPY ./users.postgre/pom.xml .

RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/

COPY ./users.postgre/src ./src

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-alpine

WORKDIR /app

RUN mkdir ./logs

COPY --from=builder /app/users.postgre/target/users.postgre-1.0.0-SNAPSHOT.jar .

EXPOSE 8010

CMD [ "java", "-jar", "./users.postgre-1.0.0-SNAPSHOT.jar" ]
