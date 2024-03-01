FROM maven:3.8.4-eclipse-temurin-11 as build 
COPY . .

FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/online-order-0.0.1.-SNAPSHOT.jar online-order.jar
COPY . .

EXPOSE 8080
ENTRYPOINT [ "java","-jar","online-order-0.0.1-SNAPSHOT.jar" ]