// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 wildcard(?)
package com.eomcs.generic.ex02;

import java.util.ArrayList;

public class Exam0224 {

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
    // m1(ArrayList<? extends B1>)
    // => B1 타입 및 그 하위 타입에 대해서 ArrayList 객체를 파라미터로 넘길 수 있다.
    //
    //m1(new ArrayList<Object>()); // 컴파일 오류!
    //m1(new ArrayList<A>()); // 컴파일 오류!
    m1(new ArrayList<B1>()); //ok
    //m1(new ArrayList<B2>()); // 컴파일 오류!
    m1(new ArrayList<C>()); //ok
  }

  static void m1(ArrayList<? extends B1> list) { // 그냥 ?를 쓰지 말자!
    // 파라미터로 받은 ArrayList가 구체적으로 어떤 타입의 값을 다루는 것인지 
    // 결정되지 않았기 때문에 컴파일러는 다음 코드가 옳은지 검사할 수 없다.
    // 그래서 컴파일 오류가 발생한다.
    //
    // ? 를 사용하여 정확한 타입을 결정하지 않으면
    // 타입이 결정되지 않은 상태에서도 유효한 코드라면 컴파일을 해준다.
    // 타입이 결정되지 않아 유효한지 아닌지 결정할 수 없는 상태라면 컴파일 오류이다.
    //
    // 컴파일 가능한 코드만 유효하다. -> add는 불가능
    //
    //    list.add(new B1()); // 컴파일 오류!
    //    list.add(new C()); // 컴파일 오류! -> B1의 자식이 C일지 아니면 다른 무언가일지 알 수 없음

    Object obj1 = list.get(0); // get은 컴파일 가능
    B1 obj2 = list.get(0);
    //C obj3 = list.get(0); // 컴파일 오류! 
    // m1(new ArrayList<B1>()); 일 경우 B1 타입을 받을텐데 
    // 이를 C 레퍼런스에는 담을 수 없기 때문에 오류!
  }
}








