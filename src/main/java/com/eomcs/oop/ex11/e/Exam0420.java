// anonymous class - 익명 클래스가 놓이는 장소: 인스턴스 필드
package com.eomcs.oop.ex11.e;

public class Exam0420 {
  interface A {
    void print();
  }

  // 인스턴스 필드의 값을 준비할 때 익명 클래스를 사용할 수 있다.
  A obj = new A() {
    @Override
    public void print() {
      System.out.println("Hello!");
    }
  };
}
