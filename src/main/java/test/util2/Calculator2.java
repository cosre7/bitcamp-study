package test.util2;

import test.util.Calculator;

public class Calculator2 extends Calculator {
  public void minus(int value) {
    this.result -= value;
    // result를 private 해뒀던 것을 (default)로 만들면 
    // 이 클래스에서도 result를 사용할 수 있다.
  }
}