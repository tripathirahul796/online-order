FROM openjdk:18 AS build
COPY . .

FROM openjdk:18.0.1-jdk-slim
COPY . .
WORKDIR /target/
#EXPOSE 8080

ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
