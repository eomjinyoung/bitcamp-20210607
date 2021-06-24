# bitcamp-20210607

## 원격 Git 서버의 저장소 복제하기

```
> git clone https://github.com/eomjinyoung/bitcamp-20210607.git
```

## 작업 파일을 로컬 저장소에 백업하기

백업 명단 작성
```
> git add .
```

로컬 저장소에 백업
```
> git commit -m "백업에 대한 간단한 내용"
```

## 로컬 저장소의 변경된 내용을 서버 저장소에 업로드 하기

```
> git push
```

## 깃 서버 저장소의 변경된 내용을 깃 로컬 저장소에 다운로드 하기

```
> git pull
```

## 1일차(2021-05-24,월) ~ 10일차(2021-06-04,금)

- 온라인 강의

## 11일차(2021-06-07,월)
- 이론
  - 소프트웨어의 종류
  - 교육 과정의 목표
  - 웹애플리케이션에서 개발자의 업무 범위
  - 웹 서버와 웹 애플리케이션 서버의 관계
  - 웹 애플리케이션에서 자바 프로그래밍의 의미
  - 자바로 애플리케이션을 만드는 과정
  - JavaSE, JavaEE, JavaME, JRE, JDK의 관계
  - local과 remote 용어의 의미
  - client와 server의 관계
  - CLI(Command Line Interface) 도구: 명령창, 콘솔창, 터미널
  - 프로그래밍 개념
  - 교육과정에서 배우는 것들 소개
- 실습
  - 개발 도구 설치
    - GraalVM 21.0 다운로드 및 설치, 설정
      - OpenJDK와 상용 JDK와의 관계
    - VSCode 설치
  - 도구 활용 테스트
    - Hello.java 작성
    - 컴파일 및 실행 테스트

## 12일차(2021-06-08,화)
- 이론
  - 실행 파일과 운영체제의 관계
  - 실행 파일과 CPU의 관계
  - 실행 파일을 만드는 방법
  - JIT 컴파일러와 AOT 컴파일러
- 실습
  - 애플리케이션 만들기
    - 컴파일 방식: C 프로그래밍
    - 인터프리터 방식: Nodejs 프로그래밍
    - 하이브리드 방식: Java 프로그래밍
  - 도구 설치
    - Windows gcc 컴파일러 설치: MinGW
    - Git 클라이언트 설치
- 수업에서 사용할 git 저장소 준비
  - github.com 에 개인 저장소 생성
    - 회원가입
    - bitcamp-study 저장소 생성
  - 로컬에 복제
    - c:/Users/사용자홈폴더/git/bitcamp-study
  - 강의 자료 저장소 복제
    - github.com/eomcs/eomcs-docs : DB 설치, 개발 도구 사용법 등
    - github.com/eomcs/eomcs-java : 자바 프로그래밍 기본 예제
    -
## 13일차(2021-06-09,수)
- 이론
  - 형상 관리 시스템 소개
    - local, 중앙집중식, 분산형 버전 관리시스템의 개요
  - git 소개
    - git 사용 흐름
    - git과 github.com의 관계
- 실습: git 기본 사용법
  - 원격 저장소를 만드는 방법
  - 원격 저장소를 로컬로 복제하는 방법
  - 작업 파일을 로컬 저장소에 백업하는 방법
  - 로컬 저장소를 원격 저장소와 동기화하는 방법
  - `.git/` 폴더와 워킹 디렉토리의 역할
  - git 충돌 해결 법

## 14일차(2021-06-10,목)
- 이론
  - git 활용법
    - .gitignore 파일의 목적 및 작성법
  - Maven 프로젝트의 표준 디렉토리 구조의 이해
    - 프로젝트 소스를 효율적으로 관리하는 방법
  - Gradle 빌드 도구 소개
    - 빌드(build)의 의미
    - Ant, Maven, Gradle 빌드 도구 소개
  - 객체지향 프로그래밍의 등장 이유
    - 단순한 절차절 프로그래밍: Cobol, Fortran, Basic, JavaScript
    - 함수형 프로그래밍: C
    - 객체지향 프로그래밍: Java, C++, C#
    - 프로그램 시작점(entry point): main() 메서드
  - 자바 클래스와 패키지의 관계
    - 무소속 클래스와 패키지 멤버 클래스를 만드는 방법
- 실습
  - 자바 컴파일러 활용법
    - `-d` 옵션: `.class` 파일을 별도의 폴더로 분리하는 방법
  - JVM 활용법
    - `-classpath` 또는 `-cp` 옵션: `.class` 파일이 있는 폴더를 지정하는 방법
    - `-encoding`: 소스 파일의 인코딩 지정하는 방법
    - 패키지 멤버 클래스를 만들과 실행하는 방법
  - Gradle 빌드 도구 사용법
    - `init` 명령: Maven 표준 디렉토리 구조로 프로젝트 폴더를 준비하는 방법

## 15일차(2021-06-11,금)
- 이론
    - 주석 : 일반 주석, javadoc 주석, 애노테이션
    - javadoc.exe 사용법
    - 리터럴 문법 
    - 데이터가 메모리에 저장되는 과정
    - 2진수, 8진수, 16진수 표기법
    - 문자집합: ASCII, ISO-8859-1(ISO-latin-1), EUC-KR, 조합형, MS949(CP949), Unicode, UTF-8(utf-8,utf8), UTF-16 
    - 이스케이프 문자: 제어문자 
- 실습

## 16일차(2021-06-14,월)
- 이론
    - 부동소수점을 메모리에 저장하는 방법
    - 변수 선언을 통해 메모리를 준비하는 방법
    - primitive data type 변수를 선언하는 방법
    - 배열 문법을 통해 같은 타입의 메모리를 여러 개 준비하는 방법
    - primitive data type 변수와 레퍼런스 변수의 차이점
    - 배열과 레퍼런스의 관계
    - 레퍼런스와 인스턴스의 관계
    - 가비지와 가비지 컬렉터의 관계
- 실습

## 17일차(2021-06-15,화)
- 이론
    - 연산자: 산술, 논리, 관계, 비트, 조건, 할당 연산자
    - 암시적 형변환과 명시적 형변환
    - 전위, 후위 연산자의 동작 원리
    - 비트 연산자의 응용
    - Eclipse IDE 소개
      - 워크스페이스 설정하는 방법
- 실습
    - Gradle 을 이용하여 일반 프로젝트를 이클립스 프로젝트로 전환하는 방법

## 18일차(2021-06-16,수)
- 이론
    - 흐름제어문: 조건문(if, if~ else~)
    - 빌드 도구 소개
      - Ant, Maven, Gradle 빌드 도구 비교
      - 각 빌드 도구의 빌트 스크립트 파일 특징
- 실습
    - Gradle 을 이용하여 프로젝트 폴더를 준비하는 방법
      - `gradle init` 명령
    - Gradle 플러그인 사용법
      - `java`, `eclipse` 플러그인 설정 및 사용법

## 19일차(2021-06-17,목)
- 이론
    - 흐름제어문: switch 문과 반복문 사용법
    - 키보드 입력을 다루는 방법
    - 도구(클래스)와 기능(메서드)
- 실습
    - Gradle 을 이용하여 프로젝트 폴더 생성에서 Eclipse IDE로 임포트까지 수행
    - 디버깅 방법

## 20일차(2021-06-18,금)
- 이론
    - 메서드 사용법
      - 메서드를 정의하고 호출하는 방법
      - 리팩토링 개념 및 extract method 기법 소개
      - 실행 흐름(thread)과 다중 실행 흐름(multi-thread)의 개념
      - call by value와 JVM 스택과 로컬 변수
      - call by reference와 Heap 
- 실습
    - github.com 에 개인 홈페이지 만들기
  
## 21일차(2021-06-21,월)
- 이론
    - 메서드 사용법
      - JVM Stack 메모리와 로컬 변수의 관계
      - Method Area, JVM Stack, Heap 메모리의 용도 비교
      - main() 메서드에서 프로그램 아규먼트 다루기
      - JVM 아규먼트를 다루는 방법
      - Properties 객체 사용법
    - 자바 표준 출력 다루기: print(), println(), printf() 
    - 자바 키보드 입력 다루기: Scanner 클래스와 메서드 사용법
- 실습

## 22일차(2021-06-22,화)
- 이론
- 실습
  - 게시글 관리 미니 애플리케이션 만들기: java-project-01
    - 변수, 연산자, 흐름 제어문 활용하기
    - 메서드 문법 활용하기
    - 클래스 문법 활용하기 : 사용자 정의 데이터 타입 다루기

## 23일차(2021-06-23,수)
- 이론
  - primitive 데이터 타입의 배열과 레퍼런스 배열의 차이점 이해
  - 레퍼런스 배열을 다루는 방법
  - 클래스 문법의 용도 : 복합 유형의 데이터 타입 정의
  - 클래스와 인스턴스 관계 및 인스턴스 사용법
  - 인스턴스와 가비지 관계 및 가비지 컬렉터의 목적
  - 인스턴스를 배열로 다루는 방법 : 레퍼런스 배열을 이용
  - 스태틱 변수와 로컬 변수, 인스턴스 변수가 생성되는 메모리 영역
  - Object 타입의 레퍼런스 용도
- 실습
  - 게시글 관리 미니 애플리케이션 만들기: java-project-01
    - src-17: 클래스를 이용하여 메서드를 분류하기 
    - src-18: 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.

## 24일차(2021-06-24,목)
- 이론
  - primitive 데이터 타입의 배열과 레퍼런스 배열의 차이점 이해
  - 레퍼런스 배열을 다루는 방법
  - 클래스 문법의 용도 : 복합 유형의 데이터 타입 정의
  - 클래스와 인스턴스 관계 및 인스턴스 사용법
  - 인스턴스와 가비지 관계 및 가비지 컬렉터의 목적
  - 인스턴스를 배열로 다루는 방법 : 레퍼런스 배열을 이용
  - 스태틱 변수와 로컬 변수, 인스턴스 변수가 생성되는 메모리 영역
  - Object 타입의 레퍼런스 용도
- 실습
  - 게시글 관리 미니 애플리케이션 만들기: java-project-01
    - src-17: 클래스를 이용하여 메서드를 분류하기 
    - src-18: 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.