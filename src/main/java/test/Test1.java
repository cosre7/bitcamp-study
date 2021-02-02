package test;

import test.util.Calculator;

public class Test1 {
  public static void main(String[] args) {
    Calculator c = new Calculator(); // 주소를 null로 하면 컴파일은 가능
    // 실행에서 에러
    c.plus(100);
    // c.result = 200; // 개발자의 의도와 다르게 사용
    // -> 변수에 임의적인 값을 넣을 수 있음
    // Calculator 클래스에서 private를 설정해서 막을 수 있음

    // System.out.println(c.result);
    // 에러발생! private 적용 시 c.result를 찾을 수 없기 때문에 출력불가
    // Calculator 클래스 안에 조회용 메서드를 만들어 주면 된다
    // getResult()
    System.out.println(c.getResult());
  }
}
