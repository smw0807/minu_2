#!/bin/bash
JAVA_APP="App"
JAVA_APP_FILE="App.java"

#param="$1"
IFS="_" read -ra word <<< "$1"

mode="${word[0]}"
type="${word[1]}"


if [[ "$1" =~ ^START_.*(ACK|OUT|ERROR|EXCPT)$ ]]; then
    echo "START!! $1"
    java ./src/$JAVA_APP_FILE $1
elif [[ "$1" =~ ^STOP.*(ACK|OUT|ERROR|EXCPT)$ ]]; then
    echo "STOP!! $1"
    JAVA_PROCESS=$(ps -ef | grep -v grep | grep "$JAVA_APP_FILE START_$type" | awk '{print $2}')
    echo "JAVA_PROCESS : $JAVA_PROCESS"
    kill $JAVA_PROCESS
else
    echo "Usage: [START_ACK | START_OUT | START_ERROR | START_EXCPT | STOP_ACK | STOP_OUT | STOP_ERROR | STOP_EXCPT | CHECK]"
fi
