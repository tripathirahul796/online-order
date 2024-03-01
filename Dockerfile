FROM openjdk:18 as build
COPY target/onlineorderapp.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
