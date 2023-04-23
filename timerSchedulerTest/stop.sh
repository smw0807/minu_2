#!/bin/bash
JAVA_APP="App"
JAVA_APP_FILE="App.java"

IFS="_" read -ra word <<< "$1"

mode="${word[0]}"
type="${word[1]}"

if [[ "$1" =~ ^STOP.*(ACK|OUT|ERROR|EXCPT)$ ]]; then
    echo "STOP!! $1"
    JAVA_PROCESS=$(ps -ef | grep -v grep | grep "$JAVA_APP_FILE START_$type" | awk '{print $2}')
    echo "$JAVA_PROCESS"
    if [[ $JAVA_PROCESS == '' ]]; then
      echo  "NO PROCESS"
    else 
      echo "JAVA_PROCESS : $JAVA_PROCESS"
      kill $JAVA_PROCESS
    fi
else
    echo "Usage: [ STOP_ACK | STOP_OUT | STOP_ERROR | STOP_EXCPT ]"
fi
