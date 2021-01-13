package com.eomcs.lang.ex05;

//# 산술 연산자 : +, -, *, /, %
//
public class Exam0110 {
  public static void main(String[] args) {
    System.out.println(100 + 27);
    System.out.println(100 - 27);
    System.out.println(100 * 27);
    System.out.println(100 / 27); // 나눈 몫 -> int 끼리의 산술인 경우 int 범위까지만 몫을 나타낸다.
    System.out.println(100 % 27); // 나눈 나머지 
  }
}