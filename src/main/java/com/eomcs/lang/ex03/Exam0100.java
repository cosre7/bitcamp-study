package com.eomcs.lang.ex03;

//# 리터럴(literal)
// - 자바 언어로 표현한 값.
// - 값을 뜻하는 단어

public class Exam0100 {
  public static void main(String[] args) {
    System.out.println("-------- 정수 리터럴");
    System.out.println(78); // 10진수
    System.out.println(+78);
    System.out.println(-78);
    System.out.println(0116); // 8진수
    System.out.println(0x4e); // 16진수
    System.out.println(0b01001110); // 2진수

    System.out.println("-------- 부동소수점 리터럴");
    System.out.println(3.14);
    System.out.println(31.4e-1);

    System.out.println("-------- 논리 리터럴");
    System.out.println(true);
    System.out.println(false);

    System.out.println("-------- 문자 리터럴");
    System.out.println('가');
    // 문자 하나를 사용하는 리터럴의 경우 작은 따옴표(' ')를 사용한다.

    System.out.println("-------- 문자열 리터럴");
    System.out.println("오호라 코딩스쿨!");
    // 문자 여러개를 뜻하는 문자열의 리터럴의 경우 큰 따옴표(" ")를 사용한다.
  }
}