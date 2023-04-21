#!/bin/bash
JAVA_APP="App"
JAVA_APP_FILE="App.java"
JAVA_PROCESS=$(ps -ef | grep -v grep | grep $JAVA_APP_FILE | awk '{print $2}')

if [[ "$1" == "START" ]]; then
    java ./src/$JAVA_APP_FILE START &
elif [[ "$1" == "STOP" ]]; then
    echo "JAVA_PROCESS : $JAVA_PROCESS"
    kill $JAVA_PROCESS
elif [[ "$1" == "CHECK" ]]; then
    echo "JAVA_PROCESS : $JAVA_PROCESS"
else
    echo "Usage: sh ./run.sh [START|STOP|CHECK]"
fi
