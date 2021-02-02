package test;

import test.util.Calculator2;

public class Test1 {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2(); // 주소를 null로 하면 컴파일은 가능
    // 실행에서 에러
    c.plus(100);
    c.minus(20); //Calculator2 를 사용해야만 쓸 수 있다.
    System.out.println(c.getResult());
  }
}
