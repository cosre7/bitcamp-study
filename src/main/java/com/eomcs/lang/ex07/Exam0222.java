package com.eomcs.lang.ex07;

// # 메서드 : 개념 및 기본 문법 II
//
public class Exam0222 {

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }

  public static void main(String[] args) {
    // 파라미터의 타입, 개수, 순서가 일치해야 한다.

    // hello("윤봉길"); // 컴파일 오류!
    // -> String과 int 파라미터에 들어갈 아규먼트가 필요한데 int가 없다.

    // hello(20, "윤봉길"); // 컴파일 오류!
    // -> String 과 int 파라미터에 들어갈 올바른 순서의 아규먼트가 아니다.

    // String r = hello("안중근", 30); // 컴파일 오류!
    // -> return 되는 값이 없는데 변수에 값을 받으려고 했다.

    // void r = hello("안중근", 30); // 컴파일 오류!
    // -> return 되는 값이 없는데 변수에 값을 받으려고 했다.
    // void 라는 데이터타입은 없다.

  }
}
