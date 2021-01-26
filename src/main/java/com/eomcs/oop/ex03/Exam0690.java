// 스태틱 초기화 블록(static initializer) - 활용
package com.eomcs.oop.ex03;

public class Exam0690 {

  public static class A {
    static float pi;

    // 스태틱 블록은 클래스 멤버를 사용하기 전에 유효한 값으로 초기화시키는 것.
    // 스태틱 블록은 이 위치에 왠만하면 두기
    // 단순한 값을 초기화 하는 경우에는 static float pi = 3.14159f; 를 더 추천

    static {
      pi = 3.14159f;
    }

    static float area(int r) {
      return pi * r * r;
    }

  }

  public static void main(String[] args) throws Exception {
    System.out.println(A.area(25));
  }
}


