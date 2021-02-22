// 예외 처리 문법을 적용하기 전 - 리턴 값을 이용한 오류 알림!
package com.eomcs.exception.ex1;

public class Exam0110 {
  public static void main(String[] args) {
    // 유효한 값을 지정하여 메서드를 호출할 때,
    int result = Calculator.compute("+", 100, 200); 
    // +가 아닌 # 같은 오타를 입력 시 return 값이 -1로 되어서
    // 결과가 -1이 나오게 된다
    // => +를 했다고 착각을 해버리면 100 + 200의 값이 -1이다. 라고 생각해버리게 된다
    // ==> 이런 형태로 프로그램을 짜서는 안된다.
    System.out.println(result);
  }
}
