// 애노테이션 프로퍼티
package com.eomcs.annotation.ex1;

public @interface MyAnnotation2 {

  // 프로퍼티를 정의할 수 있다.
  // => 인터페이스에서 메서드를 정의하는 것과 유사하다.
  // => 메서드 이름은 프로퍼티(변수)명처럼 작성한다.
  //   즉 일반적인 메서드는 보통 동사로 이름을 시작하지만,
  //   애노테이션은 명사(명사구)로 이름을 짓는다.
  String value(); // 애노테이션의 기본 프로퍼티이다. // getValue() 처럼 사용하지 말자
  // String : 값을 넣고 빼는 타입을 뜻하는 것. 일종의 getter, setter가 합해진 문법이라고 생각.

}


