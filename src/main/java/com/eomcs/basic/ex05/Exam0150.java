// Stack 클래스 사용법 - size()
package com.eomcs.basic.ex05;

import java.util.Stack;

public class Exam0150 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    for (int i = 0; i < stack.size(); i++) {
      System.out.println(stack.get(i));
    }
    // 원래 stack의 기능과 달리 먼저 추가된 값이 먼저 출력된다
    // aaa bbb ccc
  }

}

