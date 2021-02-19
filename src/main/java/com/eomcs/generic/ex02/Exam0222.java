// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 wildcard(?)
package com.eomcs.generic.ex02;

import java.util.ArrayList;

public class Exam0222 {

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
    // m1(ArrayList<?>)
    // => 모든 타입에 대해 ArrayList 객체를 파라미터로 넘길 수 있다.
    // => 다만 메서드 내부에서는 타입 검사를 할 수 없기 때문에 
    //    add() 메서드 호출 같은 타입 검사가 필요한 코드를 사용한 경우에는 컴파일 오류가 발생한다.
    //
    //m1(new ArrayList()); // OK
    //m1(new ArrayList<Object>()); // OK
    //m1(new ArrayList<A>()); // OK
    //m1(new ArrayList<B1>()); // OK
    //m1(new ArrayList<B2>()); // OK

    // 레퍼런스가 가리킬 제약 조건 설정 -> 양쪽 제약조건이 같아야 한다.
    // 예) ArrayList<B1> my1 = new ArrayList<C>();
    //     ArrayList<B1> my1 -> B1, c를 담아야 함
    //     new ArrayList<C>() -> C만 가능
    //     => 에러
    ArrayList<B1> my1 = new ArrayList<>(); //<?> 중에서 B1을 제약조건으로 선택!
    my1.add(new B1());
    my1.add(new B1());
    my1.add(new B1());
    // <B1> 제약조건에 따르기 때문에 <C>를 add할 수 있다.
    my1.add(new C()); // OK

    m1(my1); // OK
  }

  static void m1(ArrayList<?> list) { //<?> 제약조건을 따지지 않겠다
    // 컴파일러는 파라미터로 받은 ArrayList가 어떤 타입의 값을 다루는 지 알 수 없기 때문에 
    // 그 타입인지 검사해야 하는 메서드를 사용할 때는 컴파일을 명확하게 해줄 수 없다.
    // 따라서 컴파일 오류를 발생시킨다.
    // 즉 제네릭에 대한 타입 검사가 필요한 메서드를 호출할 때는
    // 타입이 지정되어 있지 않기 때문에 유효한 문법인지 알 수 없어서
    // 컴파일할 수 없다.

    /*//제약조건이 설정이 안되어있음 => 검사가 필요한 메서드(ex: add)에서는 
        컴파일러에서 검사가 불가능
    list.add(new Object());
    list.add(new A());
    list.add(new B1());
    list.add(new B2());
    list.add(new C());
     */

    Object obj1 = list.get(0);

    // 다음의 경우도 마찬가지로 get()의 리턴 타입이 무엇인지 결정할 수 없기 때문에 
    // 컴파일 해 줄수 없다. 그래서 컴파일 오류가 발생한다. 
    //A obj2 = list.get(1); // 컴파일 오류!


    // println()의 파라미터 타입이 Object 이기 때문에 다음 코드는 오류가 아니다.
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
  }
}








