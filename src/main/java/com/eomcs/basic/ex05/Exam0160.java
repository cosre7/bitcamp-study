// Stack 클래스 사용법 - Iterator 사용
// 컬렉션의 알고리즘에 상관없이 데이터를 꺼내는 방법이 동일하다
// => iterator를 사용하는 이유
package com.eomcs.basic.ex05;

import java.util.Iterator;
import java.util.Stack;

public class Exam0160 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    Iterator<String> iterator = stack.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    // 원래 stack의 기능과 달리 먼저 추가된 값이 먼저 출력된다
    // aaa bbb ccc
  }
}

