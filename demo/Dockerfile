FROM tunm4/java:latest

MAINTAINER IRD Labs

RUN ln -f -s /usr/share/zoneinfo/Asia/Ho_Chi_Minh /etc/localtime

RUN mkdir -p /workspace/application/

WORKDIR /workspace/application/

COPY application.jar .

COPY config ./config

ENV JAVA_OPTS="-Xms256m -Xmx2048m"

ENTRYPOINT exec java $JAVA_OPTS -jar application.jar --server.port=8080 --spring.config.additional-location=/config/application.properties
