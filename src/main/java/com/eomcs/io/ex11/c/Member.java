package com.eomcs.io.ex11.c;

public class Member implements java.io.Serializable {

  String name;
  int age;
  boolean gender; // true(여자), false(남자)

  // Exam0320의 두 번째 테스트를 실행할 때 주석을 풀라!
  //  String tel; // 주석풀고 저장을 하면 버전 번호가 바뀐다.

  @Override
  public String toString() {
    return "Member [name=" + name +
        ", age=" + age +
        ", gender=" + gender +
        // Exam0320의 두 번째 테스트를 실행할 때 주석을 풀라!
        //        ", tel=" + tel + // 주석풀고 저장을 하면 버전 번호가 바뀐다.
        "]";
  }
}
