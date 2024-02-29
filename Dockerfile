FROM eclipse-temurin:21-jdk-alpine as build
COPY ..
RUN mvn clean package -DskipTest

FROM openjdk:21-jdk-slim
COPY --from=build /target/online-order-0.0.1.-SNAPSHOT.jar online-order.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","online-order.jar"]
