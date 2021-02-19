// java.util.ArrayList 사용법 - 추가, 변경, 삭제
package com.eomcs.basic.ex03;

import java.util.ArrayList;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("aaa");
    System.out.println(s1 == s2);
    // 각각 힙 메모리에 저장 -> false

    String s3 = "aaa";
    String s4 = "aaa";
    System.out.println(s3 == s4); // true
    // 스트링풀에 스트링 인스턴스를 만든다 -> 인스턴스 주소 리턴 => 주소가 같다
    // 프리머티브 타입의 변수처럼 생각
    // 실제는 주소가 리턴되는 것!

    // 특정 타입의 목록을 다루고 싶다면,
    // 타입 파라미터로 해당 타입을 지정하라.
    //
    ArrayList<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    System.out.println(list); // [aaa, bbb, ccc, ddd]

    // ArrayList는 null을 추가하는 것을 허용한다.
    list.add(null);
    list.add("eee");
    System.out.println(list); // [aaa, bbb, ccc, ddd, null, eee]

    // ArrayList는 같은 인스턴스를 중복해서 추가할 수 있다.
    list.add(null);
    list.add("aaa");
    list.add("bbb");
    System.out.println(list); // [aaa, bbb, ccc, ddd, null, eee, null, aaa, bbb]
    // System.out.println(list.toString()); 할 필요 없음

    // remove(index)
    // - 목록에서 해당 인덱스의 값을 삭제한다.
    // - 리턴 값은 삭제된 값이다.
    String s = list.remove(2); // 지운 후에 지운 값 리턴 -> String s가 리턴값을 받음
    System.out.println(s); // ccc -> 리턴값 출력
    System.out.println(list); // [aaa, bbb, ddd, null, eee, null, aaa, bbb]

    list.remove(0); // 리턴해준 값을 받는 변수가 없어서 그냥 날아감
    System.out.println(list); // [bbb, ddd, null, eee, null, aaa, bbb]

    // add(index, value)
    // - 해당 위치에 값을 삽입한다.
    list.add(1, "xxx");
    System.out.println(list); // [bbb, xxx, ddd, null, eee, null, aaa, bbb]

    list.add(1, "yyy");
    System.out.println(list); // [bbb, yyy, xxx, ddd, null, eee, null, aaa, bbb]

    list.add(0, "zzz");
    System.out.println(list); // [zzz, bbb, yyy, xxx, ddd, null, eee, null, aaa, bbb]

    list.add(5, "ttt");
    System.out.println(list); // [zzz, bbb, yyy, xxx, ddd, ttt, null, eee, null, aaa, bbb]

    // set(index, value)
    // - 해당 위치의 값을 변경한다.
    list.set(1, "aaa");
    System.out.println(list); // [zzz, aaa, yyy, xxx, ddd, ttt, null, eee, null, aaa, bbb]

    // get(index) : 해당 위치의 값을 리턴한다.
    System.out.println(list.get(2)); // yyy
    System.out.println(list.get(3)); // xxx

    // 인덱스가 유효하지 않을 때 IndexOutOfBoundsException 예외가 발생한다.
    //    System.out.println(list.get(100));
  }
}


