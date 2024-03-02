FROM openjdk:18 as build
COPY . .
WORKDIR /target/
ENTRYPOINT ["java", "-jar","onlineorderapp.jar" ]
