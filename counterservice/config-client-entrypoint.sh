#!/bin/sh
while ! nc -z configservice 8888 ; do
    echo "Waiting for upcoming Config Server"
    sleep 2
done
java -jar /opt/spring-cloud/lib/counterservice-0.0.1-SNAPSHOT.jar
