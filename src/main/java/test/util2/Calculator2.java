package test.util2;

import test.util.Calculator;

public class Calculator2 extends Calculator {

  public void minus(int value) {
    this.result -= value;
  }

  // public void minus(int a) {
  // this.result -= value;
  // }
  // 변수명만 다른 것은 불가능!
  // 파라미터에 int를 넣었을 때 위의 것인지 아래의 것인지 구별이 불가능!

  public void minus(int value1, int value2) {
    this.result -= value1;
    this.result -= value2;
  }
  // minus가 있는데 또 minus 추가 -> 오버로드

  public void plus(int a, int b) {
    this.result += a;
    this.result += b;
    // 상속받은 슈퍼클래스에 있는 메서드를 또 추가 -> 오버로드
  }
  // 같은 이름을 가진 메서드가 현재 클래스나 슈퍼클래스에 존재
  // -> 오버로드
}