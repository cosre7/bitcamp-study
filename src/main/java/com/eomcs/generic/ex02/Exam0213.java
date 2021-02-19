// 제네릭(Generic) 문법 정리 - 레퍼런스와 인스턴스 생성 
package com.eomcs.generic.ex02;

import java.util.ArrayList;

public class Exam0213 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {

    ArrayList<A> list1;

    list1 = new ArrayList(); // 이렇게 사용하지 말고, 명확히 제네릭의 타입을 지정하라.
    //list1 = new ArrayList<Object>(); // 컴파일 오류! //A보다 큰 범위
    list1 = new ArrayList<>();
    list1 = new ArrayList<A>();
    //list1 = new ArrayList<B1>(); // 컴파일 오류! 
    // new ArrayList<B1>() -> B1을 담을 상자 => B1, C가 담길 수 있다
    // 하지만 list1이 가리키는 레퍼런스 ArrayList<A> 는 B2도 담아야 한다 => 에러
    // 이게 허용이 된다면 list1.add(new B2()); 의 경우
    // ArrayList<A>의 입장에서는 가능
    // new ArrayList<B1>() 입장에서는 불가능
    // => 입장에 따라 같은 코드가 가능/불가능? => 복잡하다 그냥 허락하지 말자!
    // ==> 에러!

    //list1 = new ArrayList<B2>(); // 컴파일 오류!
    //list1 = new ArrayList<C>(); // 컴파일 오류!
    // A:탄산수 B1:콜라 B2:사이다 C:레몬콜라

    ArrayList<B2> list2;

    list2 = new ArrayList(); // 이렇게 사용하지 말고, 명확히 제네릭의 타입을 지정하라.
    //list2 = new ArrayList<Object>(); // 컴파일 오류!
    list2 = new ArrayList<>();
    //list2 = new ArrayList<A>(); // 컴파일 오류!
    //list2 = new ArrayList<B1>(); // 컴파일 오류!
    list2 = new ArrayList<B2>();
    //list2 = new ArrayList<C>(); // 컴파일 오류!
  }
}








