# bitcamp-study

## 원격 Git 서버의 저장소 복제하기

```
> git clone https://github.com/cosre7/bitcamp-study.git
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

## 1일차(2020-12-21,월) ~ 8일차(2020-12-31,목)

- 자바 프로그래밍 오리엔테이션

## 9일차(2021-01-04,월)

- 수업에서 사용할 git 저장소 준비
    - github.com 에 개인 저장소 생성
        - 회원가입
        - bitcamp-study 저장소 생성
    - 로컬에 복제
        - c:/Users/사용자홈폴더/git/bitcamp-study 
    - 강의 자료 저장소 복제
        - github.com/eomcs/eomcs-docs : DB 설치, 개발 도구 사용법 등
        - github.com/eomcs/eomcs-java : 자바 프로그래밍 기본 예제
        - github.com/eomcs/eomcs-java-web : 서블릿/JSP 프로그래밍 예제
        - github.com/eomcs/eomcs-spring-webmvc : Spring WebMVC 예제
        - github.com/eomcs/eomcs-java-project-2020 : 실습 프로젝트
        - github.com/eomcs/eomcs-java-project-2021 : 실습 프로젝트
- 프로그래밍에 대한 소개
    - 컴퓨터(CPU, RAM, HDD 등) + OS + 프로그램 개념

- 학습 목표 달성 확인 목록
    - [v] 서버 컴퓨터와 서버 프로그램의 관계를 이해하는가?
        - 서버 컴퓨터는 서버 프로그램이 설치되어 있는 사이트 (ex. github.com, naver.com)를 뜻하며 도메인이라 한다.
        - 서버 프로그램이란 서버 컴퓨터에 설치되어 있으며 (ex. mail server, git server) 등 서버(host)를 뜻한다.
        - 서버와 컴퓨터를 합하여 호스트 전체 이름이라 한다.

    - [v] 서버 프로그램과 데스크톱 프로그램을 구분할 수 있는가?
        - 서버 프로그램은 서버 컴퓨터에 설치되어 있는 프로그램으로 로컬 PC에 설치되어 있지 않아 서버에 접속하여 사용할 수 있는 프로그램이다. (ex. 크롬->네이버)
        - 데스크톱 프로그램은 로컬 PC에 설치하여 사용하는 프로그램이다. (ex. 한글)

    - [v] 클라이언트 프로그램이 무엇인지 이해하고 있는가?
        - 클라이언트 프로그램이란 서버 컴퓨터에 설치되어 있는 서버 프로그램에 접속할 수 있도록 요청하는 프로그램이다.
        - 클라이언트 프로그램과 서버 프로그램은 항상 쌍으로 존재한다. (c/s Application)

    - [v] 클라이언트/서버 구조로 된 애플리케이션의 예를 들 수 있는가?
        - web client(web browser) - web server, 오버워치 클라이언트 - 오버워치 서버, 카카오톡 클라이언트 - 카카오톡 서버 ...

    - [v] git 클라이언트 프로그램을 설치할 수 있는가?
        - 구글에서 git client를 검색하여 최신의 버전으로 설치

    - [] macOS 패키지 관리자 프로그램인 HomeBrew 를 설치할 수 있는가?
    - [] HomeBrew 패키지 관리자를 통해 git 프로그램을 설치할 수 있는가?

    - [v] github.com에서 깃 저장소를 생성할 수 있는가?
        - 로그인 후 new 버튼을 눌러 깃 저장소를 생성한다.

    - [v] git 서버의 저장소를 로컬로 복제할 수 있는가?
        - 로컬에서 cmd를 실행하여 복제할 로컬의 장소를 지정한다.
        - 그 후 git clone https://github.com/cosre7/bitcamp-study.git 등의 복제할 git 서버 저장소의 주소를 적는다.

    - [v] 로컬에서 작업한 파일을 로컬 깃 저장소에 백업할 수 있는가?
        - 파일을 우선 저장한다.
        - cmd 에서 로컬 깃 저장소를 지정한다.
        - git add . 명령어를 작성한다.
        - git commint -m "백업할 내용" 명령어를 작성한다.

    - [v] 로컬 깃 저장소에 백업한 내용을 깃 서버의 저장소에 업로드 할 수 있는가?
        - git push 명령어를 작성한다.

    - [v] 컴퓨터에서 CPU와 RAM, HDD 의 관계 및 역할을 이해하고 있는가?
        - HDD는 외부 메모리, RAM은 내부 메모리이며 CPU는 실행을 해주는 공간이다.
        - HDD는 컴퓨터를 끄더라도 메모리를 유지시켜주는 공간이다.
        - RAM은 데이터 읽기 속도가 느린 HDD를 대신하여 CPU에서 실행할 명령어의 일부를 CPU의 L1에 전달해주는 역할을 한다.
        - CPU는 L1에서 읽어온 데이터를 실행하는 역할을 한다.

    - [v] OS의 역할을 대략적으로 이해하는가?
        - OS는 H/W를 운영하는 담당 S/W이다.
        - 일반 S/W의 관리도 맡는다.
        
    - [v] 명령어를 작성할 때 CPU에 맞춰서 작성해야 하고 또한 OS에 맞춰서 명령어를 구성해야 하는 이유를 설명할 수 있는가?
        - 각 CPU와 OS에 따라서 명령어의 배치나 형식에 차이가 있다.
        - 때문에 각 CPU와 OS에 맞는 형태의 명령어가 구성되어야만 실행이 가능하다.

    - [v] 명령어를 작성할 때 컴파일러의 역할은 무엇인가?
        - 컴파일러는 인간이 이해하는 언어로 작성된 명령어를 컴퓨터가 이해할 수 있는 기계어로 변환시켜주는 역할을 한다.

    - [v] 컴파일러가 OS와 CPU에 따라 구분되는 이유를 아는가?
        - 각 OS와 CPU 마다 정해진 형식과 배치가 있기 때문에 서로 다르게 컴파일해주어야 하는데 때문에 여러 형태의 컴파일러가 존재한다.

    - [v] 자바 컴파일러가 들어 있는 JDK를 설치할 때 OS와 CPU에 따라 구분해야 하는 이유를 아는가?
        - 자바의 경우 마찬가지로 각 OS와 CPU에 따라 형태와 배치 등이 다르기 때문에 실행을 하기 위해서는 각각에 맞춘 컴파일이 필요하다.
        - 이를 위해 서로 다른 OS와 CPU에 맞추어 컴파일러가 설치되어야 한다.

    - [v] 자바 컴파일러와 JVM의 역할을 설명할 수 있는가?
        - 자바 컴파일러의 경우 인간이 이해하는 언어인 명령어를 컴퓨터가 이해할 수 있는 기계어로 변환시켜주는 것이다.
        - JVM은 컴파일러를 통해 바이트코드화 된 명령어를 실행해주는 프로그램이다.

    - [v] 소스(source)와 바이트코드(bytecode)를 설명할 수 있는가?
        - 소스란 컴파일된 파일인 *.class 파일의 근원파일인 *.java 파일을 말한다.
        - 바이트코드란 소스파일이 컴파일된 형태의 언어로 완벽한 기계언어가 아닌 기계언어와 유사한 형태의 언어이다.

    - [v] 자바 컴파일러를 사용하여 소스 파일을 컴파일 할 수 있는가?
        - javac.exe 프로그램을 사용하여 소스 파일을 컴파일한다.
        - 이를 실행할 때에는 cmd 를 사용하여 javac *.java 의 형태로 진행한다.

    - [v] JVM을 사용하여 바이트코드를 실행할 수 있는가?
        - 바이트코드를 실행할 때에는 *.class 파일의 형태가 있는지 확인 후 java * 라는 명령어를 통해 실행한다.

    - [v] 컴파일 방식과 인터프리터 방식의 차이점과 장단점을 이해하는가?
        - 컴파일 방식의 경우 컴파일러를 사용하여 우선 소스파일의 컴파일을 진행한 후 이를 링커를 통해 연결하여 기계어 파일로 변환하여 실행한다.
        - 이 경우 컴파일 방식은 OS와 CPU 각각에 맞추어 수행하여야 하며 때문에 OS와 CPU에 종속적이다.
        - 또한 컴파일 할 때 한 번만 문법검사를 진행하기 때문에 실행속도가 빠르다는 장점이 있다.

        - 인터프리터 방식의 경우 각 OS별로 컴파일할 필요 없이 각 OS에 맞는 인터프리터(ex. node)를 통해 실행해주면 된다.
        - 이 경우 실행할 때마다 문법 검사를 진행하여야 하며 때문에 실행 속도가 느리다는 단점이 있다.
        - 하지만 각각의 OS에 맞는 node 만 설치하면 다른 컴파일 과정이 필요하지 않다는 장점이 있다.

    - [v] 자바는 하이브리드 방식으로 프로그램을 개발하고 실행한다. 하이브리드 방식을 설명할 수 있는가?
        - 하이브리드 방식이란 컴파일 방식과 인터프리티 방식의 속성을 모두 가지고 있는 방식이다.
        - *.java 형태의 소스 파일을 컴파일러를 통해 *.class 형태의 가상의 기계어로 컴파일한 후 각 OS별 JVM을 통해 실행되는 방식이다.
        - 때문에 write once run anywhere! 이라는 사명으로 각 OS에 맞는 형태의 컴파일은 불필요하며 실행 시에 각 OS에 맞는 JVM을 통해 실행된다.
        
get-filehash -algorithm sha512 'apache-tomcat-9.0.41.zip' -> sha512 hash code 뽑아내는 명령어
## 10일차(2021-01-05,화)

- 컴파일 방식 프로그래밍 경험
    - GCC 컴파일러(MinGW) 설치
    - hello.c 소스 작성
    - 컴파일 및 실행
- JDK와 JRE, JavaSE, JavaEE, JavaME 소개
- JDK 및 Eclipse IDE 설치 및 설정


- 학습 목표 달성 확인 목록
    - [] 컴파일 방식과, 인터프리터 방식, 하이브리드 방식의 특징을 설명할 수 있는가?
    - [] 컴파일/인터프리터/하이브리드 방식의 예제를 작성하고 실행시킬 수 있는가?
    - [] GUI와 CLI가 무엇인지 알고 있다.
    - [] OS에서 shell 과 Shell Script 의 관계를 이해한다.
    - [] 윈도우 OS에서 '명령프롬프트'와 '파워쉘'의 차이점을 이해한다.
    - [] 해시 값/디지털 지문이 무엇인지 알고 있다.
    - [] 알고리즘의 뜻을 말할 수 있다.
    - [] MD5, SHA-1, SHA256, SHA512, PGP 등이 무엇을 의미하는지 알고 있다.
    - [] Windows/macOS 에서 명령어를 사용하여 해시 코드를 알아 낼 수 있다.
    - [] JDK를 설치하고 환경 변수(JAVA_HOME, PATH)를 설정할 수 있는가?
    - [] Java IDE(Integrated Development Environment, 예: Eclipse)를 설치하고 설정할 수 있는가?

2021-01-06
cmd에서 java -version 이라고 치면 환경 변수에서 path에 등록한 경로가 나온다.
 
 JAVA_HOME은 jdk가 어떤 디렉토리에 있는지 물어보는 프로그램이 있을 때 알려주는 경로
    - 안한 상태에서 이클립스까지 설치 후 실행
    - java.exe 는 path에 등록되어있어서 실행에 문제 없음
    - 컴파일 할 때 필요한 jre를 확인할 때에 이클립스 자체에 설치되어 있는 jre가 아닌
      내가 설정한 jdk를 사용하고 싶을 때 JAVA_HOME을 해두면 이것이 자동으로 설정된다.

 bin: binary -> 왠만한 실행파일들이 들어있는 폴더 -> path 경로에 bin까지 지정해줘야 하는 이유
    - exe 파일에서 dll 파일에 들어있는 기계어를 사용해서 실행한다.
 lib: 다른 개발자가 프로그램을 짜놓은 명령어들이 들어있는 폴더

 환경변수: 특정 이름으로 경로를 설정해두면 경로가 필요한 프로그램이 자동으로 찾아갈 수 있도록 해주는 것
path설정을 하지 않을 경우 컴파일 시 마다 jdk가 들어있는 폴더 경로를 적은 후에 컴파일을 해야 한다.
    - C:\java\graalvm-ce-java11-20.3.0\bin\javac Hello.java 라고 해야 한다.
    - path 설정에 C:\java\graalvm-ce-java11-20.3.0\bin 이라고 해두었기 때문에 컴파일 시에 javac Hello.java라고만 하면 되는 것이다.
    - 환경변수의 경우 위에 있는 것부터 찾아서 하기 때문에 제일 위로 올려주어야 한다.
    - 환경변수를 바꾸고 나면 cmd(명령창)을 껐다가 다시 켜야 한다.

1. 직접 바이트코드 작성해보기 -> "바이트코드는 할게 못된다" 만 기억하기
    - sublime editor -> download(windows 64bit) -> 다음 다음 인스톨
    - file - save with encoding - hexa~ -> bitcamp-study -> HelloWorld.class 생성
    - bytecode hello world programming 구글링 -> Writing Hello World in Java byte code 클릭
    - CLASS 만들기 
        1) ca fe ba be -> 이 클래스는 바이트코드다
        2) 00 00 -> minor version
        3) 00 34 -> major version (각각의 버전마다 있는 고유의 번호 ex. 52.0 일 경우 minor version = 0 major version = 52)
        4) 00 00
        5) 00 21 -> public
        6) 00 00 -> this class
        7) 00 00
        8) 00 00
        9) 00 00
        10) 00 00
        11) 00 00
        12) 00 00
        -> public class ??? {

        } 
        라고 출력
    - cmd(명령창) -> javap *.class 라고 하면 바이트코드를 읽어오는 명령어
        - 00 03 상수 pool 2일 경우 1+2(상수 수)로 00 03
        - 07 00 02 -> 2번째 상수가 클래스 이름이다.
    - HelloWorld 만들기
        - 01 00 0a 48 65 6c 6c 6f 57 6f 72 6c 64 -> 1번 데이터: 10바이트 (00 0a)로 이루어진 H e l l o W o r l d
    -> https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad 사이트에 자세한 설명.
    - 0x -> 16진수라는 뜻

## 11일차(2021-01-06,수)

- 바이트코드 프로그래밍 
    - 직접 바이트코드를 작성해보기
    - 자바 언어를 이용한 프로그래밍의 이점을 이해하기
    - sublime 에디터 설치
    - HelloWorld.class 작성하기
    - https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad
- 학습 목표 달성 확인 목록
    - [] bytecode(portable code, p-code) 가 무엇인지 이해하는가?
    - [] 바이트코드를 직접 작성하는 것보다 소스 파일을 작성해서 컴파일하는 것이 낫다는 것을 이해하는가?
    - [] 빌드 도구가 무슨 일을 하는지 알고 있는가?
    - [] 대표적인 자바 빌드 도구의 종류를 말할 수 있는가? 
    - [] 각 빌드 도구의 설정 파일을 구분할 수 있는가?
    - [] 중간 언어를 이용하는 vm 방식과 LLVM 방식의 특징을 이해하는가? 

## 12일차(2021-01-07,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex01 ~ ex03 예제 
- Gradle 빌드 도구 설치
    - gradle.org 사이트에서 다운로드 후 설치 및 설정
    - .gitignore 파일 추가
- 이클립스로 프로젝트 임포트
    
- 학습 목표 달성 확인 목록
    - [] 자바 소스 파일과 class {} 블록, 컴파일러의 관계를 이해하는가?
    - [] 공개 클래스와 디폴트 클래스, 소스 파일명의 관계를 이해하는가?
    - [] 자바 패키지의 목적을 이해하는가?
    - [] 패키지에 소속된 클래스를 정의할 수 있는가?
    - [] 패키지에 소속된 클래스와 무소속 클래스를 컴파일하면 어떻게 되는지 알고 있는가?
    - [] 패키지에 소속된 클래스를 JVM으로 실행할 수 있는가?
    - [] 일반 주석과 javadoc 주석, 애노테이션의 용도를 이해하는가?
    - [] javadoc 프로그램을 사용하여 API 문서를 생성할 수 있는가?
    - [] 메모리와 비트, 2진수의 관계를 이해하는가?
    - [] 비트 크기에 따라 저장할 수 있는 수의 범위를 계산할 수 있는가?
    - [] 메모리에 정수 값을 저장할 때 음수를 어떻게 저장하는지 알고 있는가?
    - [] 2의 보수가 무엇인지 아는가? 2의 보수를 사용하여 양수를 음수로 바꿀 수 있는가?
    - [] 자바 언어에서 정수 리터럴을 4바이트와 8바이트로 구분하여 표현할 수 있는가?
    - [] Gradle 빌드 도구를 설치하고 실행할 수 있는가?
    - [] build.gradle 설정 파일을 작성하고, 플러그인 추가/라이브러리 등록 을 할 수 있는가?
    - [] Gradle을 이용하여 이클립스 설정 파일을 생성할 수 있는가?
    - [] 이클립스에서 프로젝트를 임포트 할 수 있는가? 
    - [] .gitignore 파일의 용도를 알고 있는가?

## 13일차(2021-01-08,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex03 예제 
    - 정수/부동소수점/문자를 2진수로 표현하는 방법
- 학습 목표 달성 확인 목록
    - [] 정수를 2진수로 표현할 때 Sign-Magnitude, 1의 보수, 2의 보수, Excess-K 각각의  방식으로 표현할 수 있는가?
    - [] 정수를 저장할 때 Sign-Magnitude 가 아닌 2의 보수 방식으로 저장하는 이유를 아는가?
    - [] 값을 2진수로 표현하는 이유는 무엇인가?
    - [] 정수 말고, 2진수로 표현하는 다른 종류의 값을 말할 수 있는가?
    - [] 부동소수점을 리터럴로 표현할 수 있는가?
    - [] 부동소수점을 메모리 크기에 따라 4바이트, 8바이트 리터럴로 구분하여 표현할 수 있는가?
    - [] 부동소수점을 2진수로 표현할 수 있는가?
    - [] 부동소수점의 범위를 유효자릿수로 표현하는 이유를 아는가?
    - [] 4바이트 부동소수점과 8바이트 부동소수점의 유효자릿수는 무엇인가?
    - [] 문자의 2진수 표현을 정의한 것을 무엇이라 부르는가?
    - [] character set의 다양한 종류(ASCII,ISO-8859-1,EUC-KR,조합형,MS949,Unicode,UTF-8,UTF16)와 그 특징을 설명할 수 있는가?
    - [] 자바에서는 UTF-16BE(UCS2)을 기본 character set으로 사용한다는 것을 아는가?


## 14일차(2021-01-11,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex03 예제 
    - 자바 컴파일러와 JVM에서 Character Set을 다루는 과정
    - 인코딩과 디코딩 개념
    - JVM에서 문자를 출력하는 과정과 폰트의 사용
    - 폰트 및 그림의 래스터 방식과 벡터 방식의 개념
    - 자바에서 문자를 코드화 해서 다루는 방법
    - 변수의 개념과 변수를 선언하는 방법
    - 정수, 부동소수점, 논리, 문자 등 자바 원시 타입 변수를 사용하는 방법
    - 레퍼런스 변수와 자바 원시 타입 변수의 차이점
    - 배열 다루는 방법
    - 인스턴스와 가비지 개념
- 학습 목표 달성 확인 목록
    - [] 컴파일 할 때 -encoding 옵션을 붙여야 하는 경우와 그 이유를 아는가?
    - [] 인코딩과 디코딩을 설명할 수 있는가?
    - [] 폰트가 무엇이고 언제 사용되는지 알고 있는가?
    - [] 래스터 방식 폰트와 벡터 방식 폰트의 구동 원리를 설명할 수 있는가?
    - [] JVM에서 문자를 다루는 방식을 아는가?
    - [] 변수가 무엇인지 설명할 수 있는가? 
    - [] 변수 선언이 무엇인지 설명할 수 있는가?
    - [] 데이터타입과 변수의 관계를 이해하는가?
    - [] 자바 원시 타입의 변수를 선언하고 값을 할당할 수 있는가?
    - [] 자바 원시 타입 변수와 레퍼런스 변수의 차이점을 이해하는가?
    - [] 배열을 생성하고 배열의 각 항목의 값을 다룰 수 있는가?
    - [] 배열을 이용하여 인스턴스와 가비지를 설명할 수 있는가?

## 15일차(2021-01-12,화)

- Application Architecture 소개
    - 애플리케이션 아키텍처의 시대 별 변화 과정
    - 각 아키텍처의 특징과 단점, 그리고 해결책
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 1-a 단계: 자바 프로젝트 폴더 준비
        - gradle 빌드 도구를 사용한다.
        - Maven 빌드 도구의 표준 디렉토리 구조로 프로젝트 폴더를 구성한다.
    - 1-b 단계: 프로젝트를 이클립스 IDE로 임포트 하기
        - build.gradle 파일을 편집한다.
        - `eclipse` 그래이들 플러그인 추가
        - `$ gradle eclipse` 명령을 실행하여 이클립스 IDE 관련 설정 파일을 준비한다.
        - 이클립스에서 프로젝트를 임포트 한다.
    - 1-c 단계: 프로젝트에 버전 관리 시스템 Git을 적용하기
        - 
- 학습 목표 달성 확인 목록
    - [] 시스템 소프트웨어와 애플리케이션 소프트웨어를 설명할 수 있는가?
    - [] 애플리케이션 아키텍처의 종류와 특징을 설명할 수 있는가?
    - [] gradle 빌드 도구를 사용하여 자바 애플리케이션 프로젝트를 구성할 수 있는가?