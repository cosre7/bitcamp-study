// inner class : 클래스 정의와 인스턴스 생성
package com.eomcs.oop.ex11.c;

class A {
  class X {
    // class X 내부에서 작업을 할 때 class A(바깥 클래스)의 인스턴스를 사용한다
    // => class X를 non-static으로 만듬
  }
}

public class Exam0110 {

  public static void main(String[] args) {
    // 레퍼런스 선언
    A.X obj;

    // 인스턴스 생성
    //obj = new A.X(); // 컴파일 오류! // static에서 만드는 방법

    //1) 바깥 클래스의 인스턴스 준비
    A  outer = null;//new A();
    // null로 두면 컴파일러는 통과. 실행할 때 에러
    // 그러므로 new A(); => 유효한 주소가 되야 한다.

    //2) 바깥 클래스의 인스턴스 주소를 사용하여 inner class의 인스턴스 생성
    obj = outer.new X();

  }

}
