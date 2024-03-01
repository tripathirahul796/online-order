FROM openjdk:18 as build
COPY onlineorderapp.jar /user/src/app
WORKDIR /user/src/app
ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
