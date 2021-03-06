// 예외 처리 문법을 적용한 후 - 시스템을 멈추지 않고 계속 실행할 수 있다. 
// 예외가 발생해도 시스템이 멈추지 않고 계속 실행할 수 있도록 해주는 문법 -> 예외 처리 문법
package com.eomcs.exception.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam0120 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    while (true) {
      System.out.print("입력> ");
      String op = keyScan.next();
      if (op.equalsIgnoreCase("quit"))
        break;

      try {
        int v1 = keyScan.nextInt();
        int v2 = keyScan.nextInt();

        int result = Calculator3.compute(op, v1, v2);
        System.out.println(result);

      } catch (InputMismatchException e) {
        System.out.println("입력 값이 유효하지 않습니다.");
        keyScan.nextLine(); // 입력이 잘못되었을 경우, 나머지 입력을 무시한다.

      } catch (RuntimeException e) {
        System.out.println(e.getMessage());
      } 
      // 메시지를 던져준 후에 계속 프로그램 실행
    }
    keyScan.close();
  }
}


