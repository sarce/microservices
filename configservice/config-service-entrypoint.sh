#!/bin/sh
while ! nc -z registryservice 8761 ; do
    echo "Waiting for upcoming Registry Server"
    sleep 2
done
java -jar /opt/spring-cloud/lib/configservice-0.0.1-SNAPSHOT.jar
