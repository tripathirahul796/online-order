FROM openjdk:21 as build
WORKDIR /user/src/onlineorder
COPY . /user/src/onlineorder/

CMD ["java","-jar","online-order-0.0.1-SNAPSHOT.jar"]
