package com.eomcs.lang.ex06;

//# 흐름 제어문 - switch와 break
//
public class Exam0223 {
  public static void main(String[] args) {
    int score = 60;
    // break 문을 쓰지 않으면 계속 이어서 실행된다.
    // => 일부러 쓰지 않을 때가 있다.
    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
      case 40:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }
    // score가 정확하게 100 90 80 70 60 50 40 이 아니면 모두 F로 표시
    // 성적 표시할 때에는 switch 보다 if 문이 더 좋을 것으로 생각된다.
  }
}
