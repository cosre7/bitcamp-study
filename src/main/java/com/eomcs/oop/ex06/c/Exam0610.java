// 오버라이딩(overriding) - 리턴 타입
package com.eomcs.oop.ex06.c;

public class Exam0610 {

  static class A {}
  static class B extends A{}
  static class C extends B {}

  static class AFactory {
    A create() {
      return new A();
    } // 쓸것을 달라!
  }

  static class BFactory extends AFactory {
    // 오버라이딩 메서드의 리턴 타입은
    // 서브 클래스도 가능하다.
    @Override
    //    A create() {
    //      return new B();
    //      // A(쓸 것) B (볼펜) 
    //    }

    //    String create() {
    //      return new String();
    //    } // 리턴타입이 달라서 불가능 -> 쓸것을 달라는데 빵을 주는 격

    B create() {
      return new B();
    } // 볼펜을 줄게!!
  }

  static class CFactory extends AFactory {
    @Override
    C create() {
      return new C();
    } 
  }
  public static void main(String[] args) {
    new CarFactory().makeCar().run();
    new SedanFactory().makeCar().run();
    new TruckFactory().makeCar().run();
    new DumpTruckFactory().makeCar().run();
    new DumpTruckFactory2().makeCar().run();
  }
}








