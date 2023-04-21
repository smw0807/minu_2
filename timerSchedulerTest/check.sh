#!/bin/bash

# 자바 클래스 경로를 찾아 변수에 할당하는 함수
find_classpath() {
    # "java" 명령어가 없으면 오류 출력 후 종료
    if ! command -v java &> /dev/null; then
        echo "java 명령어를 찾을 수 없습니다." >&2
        exit 1
    fi

    # "java" 명령어를 사용하여 클래스 경로를 찾음
    classpath=$(java -cp . -verbose:class 2>&1 | grep 'opened:' | sed -e 's/^.*opened:\s*//' -e 's/\s*$//' | tr '\n' ':')

    # 클래스 경로가 비어 있으면 오류 출력 후 종료
    if [ -z "$classpath" ]; then
        echo "자바 클래스 경로를 찾을 수 없습니다." >&2
        exit 1
    fi

    # 클래스 경로를 환경 변수로 설정
    export CLASSPATH=$classpath

    # 변수에 할당하여 반환
    echo $classpath
}

# 함수를 호출하여 클래스 경로를 변수에 할당
classpath=$(find_classpath)

echo "자바 클래스 경로: $classpath"
