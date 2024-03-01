FROM openjdk:21 as build
COPY . .

EXPOSE 8080
ENTRYPOINT ["java","-jar","online-order.jar"]
