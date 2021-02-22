// Exception 예외 던지고 받기
package com.eomcs.exception.ex4;

public class Exam0120 {

  static void m1() throws Exception {
    // m2() 를 호출하는 m1() 
    // m1()을 호출하는 누군가가 예외를 처리하라고 던짐

    // m2()와 같다.
    m2();
  }

  static void m2() throws Exception {
    // m3()에서 발생된 예외를 상위 호출자에게 던지려면
    // m2() 메서드에서도 선언부에 예외를 기술해야 한다.
    // => m2() 안에서 Exception 예외가 발생합니다" 라고!
    m3();
  }

  static void m3() throws Exception {
    // m4()에서 발생된 예외를 상위 호출자에게 던지려면
    // m3() 또한 메서드 선언부에 해당 예외를 기술해야 한다.
    // => "m3() 안에서 Exception 예외가 발생합니다" 라고!
    m4();
  }

  static void m4() throws Exception {
    // 이 메서드에서 발생된 예외를 main()에 전달하는 방법
    // => 상위 호출자에게 전달하려면 여기서 try ~ catch ~ 해서는 안된다.
    // => 여기서 예외를 처리하지 않으면 
    //    메서드 선언부에 어떤 예외가 발생하는 지 선언해줘야 한다.
    throw new Exception("m4()에서 예외 발생!");
    // try ~ catch ~ 를 하거나
    // throws 로 던지거나
    // 둘 중에 하나는 해야만 한다!

    // 만약 여기에서 try ~ catch ~ 를 해서 예외처리를 해버리면
    // throws 문장이 없어지기 때문에
    // 호출하는 쪽에서 예외가 있다는 사실을 알기 어려울 수도 있다 
    // -> 그래서 일부러 throws를 쓰는 경우가 있다.
  }

  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Exception 계열의 예외를 상위 호출자에게 전달하려면,
    // 그 호출 경로에 있는 모든 메서드에
    // throws 문장을 선언해야 하는 버거로움이 있다.
    // 어쩔 수 없다!
    // 무조건 선언해야 한다.

    // main 에서 throws 문장을 선언하면 무조건 에러
  }

}
