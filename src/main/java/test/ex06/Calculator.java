package test.ex06;

public class Calculator {

  int result;

  void plus(int value) {
    // static이 안붙은 메소드에는 Calculator this; 라는 변수가 항상 선언되어 있다.
    // 일명 히든변수
    this.result += value;
    // this는 레퍼런스 변수
    // 모든 인스턴스 변수에 내장되어있는 내장변수
  }

  void minus(int value) {
    this.result -= value;
    // this.result 라는 것은 인스턴스의 result를 나타낸다.
    // this는 생략이 가능하다. -> 컴파일 하면 다시 생긴다.
  }

  void multiple(int value) {
    this.result *= value;
  }

  void divide (int value) {
    this.result /= value;
  }
}
