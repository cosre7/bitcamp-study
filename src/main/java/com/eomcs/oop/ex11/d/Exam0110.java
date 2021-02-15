// local class : 클래스 정의와 인스턴스 생성
package com.eomcs.oop.ex11.d;

class A {
  void m1() {
    // 메서드 안에 정의하는 클래스를 "local class"라 한다.
    // - 특정 메서드 안에서만 사용되는 경우 로컬 클래스로 정의한다.
    // - 쓸데없이 외부로 노출하지 않기 위함.
    // - 노출을 줄이면 유지보수에 좋다.
    // - 로컬 클래스에서 로컬 이라는 말은 '이 메서드 안에서만 사용할 수 있다'는 뜻이다.
    // - 그냥 사용 범위에 대한 제한을 가리키는 말이다.
    // - 메서드를 호출할 때 클래스가 정의된다는  뜻이 아니다.

    class X { //class X는 m1()이라는 메서드 안에서만 사용된다. 라는 뜻
      // 컴파일할 때 class X 생성 => A$1X
      // => 메서드 안에 있지만 메서드가 호출될 때 마다 클래스가 만들어지는 것이 아니라
      //    따로 추출되서 클래스로 만들어진다. (한번만) => 대신 메서드 안에 있기 때문에
      //    제약조건이 붙을 뿐
      // 클래스는 한번만 로딩된다!
      // 
    }
    X obj = new X();
  }

  static void m2() {
    // 메서드 안에 정의하는 클래스를 "local class"라 한다.
    class X {
      // 컴파일할 때 class X 생성 => A$2X
    }
    X obj = new X();
  }
}

public class Exam0110 {

  public static void main(String[] args) {
    A outer = new A();
    outer.m1();
  }

}
