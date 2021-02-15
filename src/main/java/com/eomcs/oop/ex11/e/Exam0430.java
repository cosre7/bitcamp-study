// anonymous class - 익명 클래스가 놓이는 장소: 로컬 변수
package com.eomcs.oop.ex11.e;

public class Exam0430 {
  interface A {
    void print();
  }

  void m1() {
    // 로컬 변수의 값을 준비할 때 익명 클래스를 사용할 수 있다.
    A obj = new A() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    };
    obj.print();
  }

  public static void main(String[] args) {
    Exam0430 r = new Exam0430();
    r.m1();
  }
}
