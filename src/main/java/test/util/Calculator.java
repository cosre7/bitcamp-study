package test.util;

public class Calculator {
  protected int result;
  // private: 내부에서만 접근 가능하도록 접근제어
  // (default): 같은 패키지의 클래스에서 사용 가능
  // protected: 상속받는 경우 사용 가능
  // public: 모든 곳에서 사용 가능

  // 초보 개발자일 때는 공개할거 - public
  // 숨길거 - private
  // 상속을 생각할 때 default, protected를 사용할 것
  // 이 경우는 후에 나올 것이다

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
