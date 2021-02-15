// nested class : 접근 제어
package com.eomcs.oop.ex11.a;

public class Exam0310 {
  //중첩 클래스도 클래스의 멤버이기 때문에 필드나 메서드처럼 접근 제한자를 붙일 수 있다.
  private static class A1 {} 
  static class A2 {}
  protected static class A3 {}
  public static class A4 {}

  private class B1 {} 
  class B2 {}
  protected class B3 {}
  public class B4 {}

  void m() {
    // 로컬 클래스는 로컬 변수처럼 접근 제어자를 붙일 수 없다.
    //    private int a = 100; // 컴파일 오류!
    //    private class C{} // 컴파일 오류!
  }
}