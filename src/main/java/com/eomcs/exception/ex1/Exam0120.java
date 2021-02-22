// 예외 처리 문법을 적용하기 전 - 리턴 값을 확인하여 오류 여부를 파악하기
package com.eomcs.exception.ex1;

public class Exam0120 {
  public static void main(String[] args) {
    // 유효하지 않은 연산자를 지정할 때,
    int result = Calculator.compute("#", 100, 200);

    // 제대로 계산을 수행했는지 검사하기 위해서 보통 리턴 값을 검사한다.
    if (result == -1) { // 계산 결과를 확인하는 결과를 거쳐준다.
      // 이 때 -1이 유효한 값일 경우에도 오류라고 인식해버린다 
      System.out.println("유효하지 않은 연산자입니다!");
    } else {
      System.out.println(result);
    }
  }
}


