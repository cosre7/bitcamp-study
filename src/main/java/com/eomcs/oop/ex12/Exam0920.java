// List 와 forEach() - forEach() 사용 후
package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exam0920 {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("홍길동");
    names.add("임꺽정");
    names.add("유관순");
    names.add("김구");
    names.add("안중근");

    class MyConsumer implements Consumer<String> { // 잘 안씀
      // Consumer 자체를 String으로 해버려서 아예 String으로 고정
      // 무조건 accept의 타입을 String으로 하고 싶으면 이 방법
      @Override
      public void accept(String item) {
        System.out.println(item);
      }
    }
    names.forEach(new MyConsumer());

    //    class MyConsumer2<T> implements Consumer<T> {
    //      @Override
    //      public void accept(T item) {
    //        System.out.println(item);
    //      }
    //    }
    // 상황에 따라 타입을 변경하고싶다면 이 방법
    // MyConsumer2<String> c1 = new MyConsumer2<>();
    // MyConsumer2<Integer> c2 = new MyConsumer2<>();
    // MyConsumer2<java.util.Date> c3 = new MyConsumer2<>();

    //    names.forEach(new MyConsumer2<String>());
    // 인스턴스가 String으로 결정되는 순간 new MyConsumer2<String>()
    // T가 String으로 결정된다.
    // 상황에 따라 타입을 변경하고싶다면 이 방법


  }
}