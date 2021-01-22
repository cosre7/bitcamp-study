package test.ex05;

public class Calculator {

  int result;

  static void plus(Calculator that, int value) {
    // 파라미터는 로컬변수다.
    that.result += value;
  }

  static void minus(Calculator that,int value) {
    that.result -= value;
  }

  static void multiple(Calculator that,int value) {
    that.result *= value;
  }

  static void divide (Calculator that,int value) {
    that.result /= value;
  }
}
