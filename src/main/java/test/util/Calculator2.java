package test.util;

public class Calculator2 extends Calculator {
  // 기존의 Calculator 설계도에 2 덧붙인다.
  //private int result; // Calculator와 중복

  //  public void plus(int value) {
  //    this.result += value; // Calculator와 중복
  //  }

  public void minus(int value) {
    this.result -= value;
  }

  //  public int getResult() {
  //    return this.result; // Calculator와 중복
  //  }
  //}
