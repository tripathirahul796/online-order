FROM openjdk:18 as build
COPY target/onlineorderapp.jar /user/src/app
WORKDIR /user/src/app
ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
