// Lambda 문법 - functional interface의 자격
package com.eomcs.oop.ex12;

public class Exam0210 {

  // 추상 메서드가 한개인 인터페이스 이어야 한다.
  interface Player {
    void play();
  }

  public static void main(String[] args) {

    // 익명 클래스
    Player p0 = new Player() {
      @Override
      public void play() {
        System.out.println("Player...");
      }
    };

    // 추상 메서드를 한 개만 갖고 있는 인터페이스에 대해
    // 람다 문법으로 익명 클래스를 만들 수 있다.
    // 단, 추상 클래스는 불가능!
    Player p = () -> System.out.println("Player...");
    // 잘 모르겠으면 익명 클래스 만들어서 확인해보기
    p.play();
  }
}


