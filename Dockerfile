FROM openjdk:18 as build
WORKDIR /user/src/onlineorder
COPY . /user/src/onlineorder/
CMD ["java","-jar","online-order.jar"]