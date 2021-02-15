// static nested class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.b;

class B {
  // 클래스 멤버
  static int v1; // 스태틱 필드
  static void m1() {} //스태틱 메서드

  // 인스턴스 멤버
  int v2; //인스턴스 필드
  void m2() {} //인스턴스메서드

  static class X {
    void test() {
      // 같은 클래스 멤버 접근 가능
      B.v1 = 100;
      B.m1();

      // 바깥 클래스 이름 생략 가능
      v1 = 200; 
      m1(); 

      // 스태틱 멤버는 인스턴스 멤버 접근 불가능!
      //v2 = 100; // 컴파일 오류! //스태틱 클래스에는 this(인스턴스 주소) 가 없기 때문
      //m2(); // 컴파일 오류!
    }
  }
}

public class Exam0210 {

  public static void main(String[] args) {
    B.X obj = new B.X();
    obj.test();

    System.out.println(B.v1);

  }

}
