FROM maven:3.8.9-openjdk:17 as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/online-order-0.0.1.-SNAPSHOT.jar online-order.jar

EXPOSE 8080
ENTRYPOINT [ "java","-jar","online-order.jar" ]