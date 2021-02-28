package com.eomcs.lang.ex04;

//# 변수 사용 오류 I
//- 변수에 값을 저장하지 않은 상태에서 변수를 사용할 수 없다.
//

public class Exam0330 {
  public static void main(String[] args) {

    int age;

    //값이 저장되지 않은 변수를 사용하면 문법 오류이다.
    // age에 저장된 값이 없기 때문에 출력할 수가 없다.
    System.out.println(age);

    // 값을 저장 후에 변수를 사용할 수 있다.
    age = 20;
    System.out.println(age);

  }
}
