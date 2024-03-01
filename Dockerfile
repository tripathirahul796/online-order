FROM openjdk:18 as build
COPY * /user/src/app
WORKDIR /user/src/app
ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
