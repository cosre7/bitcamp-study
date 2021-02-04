package test;

import java.sql.Date;

public class Test {

  static void print(Object obj) {
    System.out.println("===> " + obj.toString());
    // string과 date -> 다형적 변수 이용
  }

  public static void main(String[] args) {
    print(Integer.valueOf(100));
    print(Float.valueOf(3.14f));
    print("홍길동");
    print(new Date(System.currentTimeMillis()));
  }

}
