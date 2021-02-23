// 폴더 정보 조회 - java.io.File 클래스
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    // 원래는 main이 마지막 보루이지만
    // 지금은 File I/O 공부가 목적이므로 던지자!

    // File 클래스
    // => 디렉토리나 파일을 다룰 때 사용하는 클래스이다.
    // => 디렉토리나 파일을 생성, 삭제, 변경할 수 있다.

    // 현재 디렉토리를 조회
    // => '.' 으로 표현한다.
    // => JVM을 실행하는 위치가 현재 폴더이다.
    // => 이클립스에서는 프로젝트 디렉토리를 가리킨다.
    // => 콘솔창에서는 현재 명령어를 실행하는 위치를 가리킨다.
    //
    File currentDir = new File("./src/main/java");
    System.out.printf("폴더명: %s\n", currentDir.getName());
    System.out.printf("경로: %s\n", currentDir.getPath()); // 파일 생성자에 넘겨준 경로 그대로
    System.out.printf("절대경로: %s\n", currentDir.getAbsolutePath());
    // 절대경로: C:\Users\pc\git\bitcamp-study\.\src\main\java
    System.out.printf("계산된 절대경로: %s\n", currentDir.getCanonicalPath()); 
    // .을 다 계산 -> 최종 완성 경로
    // 계산된 절대경로: C:\Users\pc\git\bitcamp-study\src\main\java

    System.out.printf("총크기: %d\n", currentDir.getTotalSpace());
    // 총크기: 240875597824 -> 3자리씩 끊어서 byte MB GB TB...
    System.out.printf("남은크기: %d\n", currentDir.getFreeSpace());
    // 남은크기: 84186243072
    System.out.printf("가용크기: %d\n", currentDir.getUsableSpace());
    // 가용크기: 84186243072

    System.out.printf("디렉토리여부: %b\n", currentDir.isDirectory());
    // 디렉토리여부: true
    System.out.printf("파일여부: %b\n", currentDir.isFile());
    // 파일여부: false
    System.out.printf("감춤폴더: %b\n", currentDir.isHidden());
    // 감춤폴더: false
    System.out.printf("존재여부: %b\n", currentDir.exists());
    // 존재여부: true 
    System.out.printf("실행가능여부: %b\n", currentDir.canExecute());
    // 실행가능여부: true
  }

}


