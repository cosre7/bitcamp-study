// 제네릭(generic) 적용 전 - Object를 이용한 다형적 변수 사용
package com.eomcs.generic.ex01;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {

  public static Object echo(Object obj) {
    return obj;
  }

  public static void main(String[] args) {

    // echo() 리턴 타입이 Object이기 때문에 String 레퍼런스로 바로 받을 수 없다.
    // Object이기 때문에 date일 수도 있고 integer일 수도 있고 무엇이 될지 모른다
    // => 해결책? 형변환 해야 한다.
    //
    //String obj = echo(new String("Hello")); // 컴파일 오류! //컴파일러는 문법적으로만 따진다!
    String obj = (String) echo(new String("Hello"));
    // 컴파일러 - Object에 string이 들어갈 수 있는지 없는지.. 만 검사
    // jvm - 이게 실행이 될 수 있는지 없는지 확인 -> String을 integer로? 놉!

    // 잘못된 형변환은 컴파일러는 속일 수 있을 지라도, runtime 에서는 오류를 발생시킨다.
    //Integer obj2 = (Integer) echo(new String("Hello")); // 실행 오류!

    Date obj3 = (Date) echo(new Date());

    Calendar obj4 = (Calendar) echo(Calendar.getInstance());
  }

}
