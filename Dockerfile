FROM amazoncorretto:24

RUN mkdir -p /home/app

ENV HOME=/home/app
WORKDIR $HOME

COPY target/SpaceRestAPI-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]