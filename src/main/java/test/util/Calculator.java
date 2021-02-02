package test.util;

public class Calculator {
  int result;
  // private 내부에서만 접근 가능하도록 접근제어
  // (default)로 해두어야 같은 패키지의 클래스에서 사용 가능

  public void plus(int value) {
    this.result += value;
    // public 어디서든 쓸 수 있게 공개
  }

  public int getResult() {
    return this.result;
    // result 조회용 메소드
    // 조회용은 보통 get+변수명으로 설정
    // getResult
  }
}
