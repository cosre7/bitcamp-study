package com.eomcs.lang.ex03;

//# 부동소수점 리터럴 - 최소값과 최대값
// 부동소수점의 경우 최소값과 최대값이 있지만
// 실제로는 유효자릿수를 생각해야 한다.
public class Exam0330 {
  public static void main(String[] args) {

    //## 4바이트 부동소수점의 최대값과 최소값
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    //## 8바이트 부동소수점의 최대값과 최소값
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);
  }
}
