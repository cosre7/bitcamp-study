package com.eomcs.lang.ex04;

//# 변수 선언 오류 II
//
public class Exam0230 {

  public static void main(String[] args) {

    int age;

    //같은 블록 안에서 같은 이름의 변수를 중복해서 선언할 수 없다. 
    // 선언하고싶으면 age2 등과 같이 다른 이름이 필요하다
    int age; // 문법 오류!
  }
}
