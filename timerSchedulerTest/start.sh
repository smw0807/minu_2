#!/bin/bash
JAVA_APP="App"
JAVA_APP_FILE="App.java"

if [[ "$1" =~ ^START_.*(ACK|OUT|ERROR|EXCPT)$ ]]; then
    echo "START!! $1"
    JAVA_PROCESS=$(ps -ef | grep -v grep | grep "$JAVA_APP_FILE $1" | awk '{print $2}')
    echo "$JAVA_PROCESS"
    if [[ $JAVA_PROCESS == '' ]]; then
      echo "GOGO"
      java ./src/$JAVA_APP_FILE $1
    else 
      echo "nono"
    fi
else
    echo "Usage: [ START_ACK | START_OUT | START_ERROR | START_EXCPT ]"
fi
