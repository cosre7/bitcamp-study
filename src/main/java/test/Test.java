package test;

import java.sql.Date;

public class Test {
  static void print(int value) {
    System.out.println("===> " + value);
  }

  static void print(String str) {
    System.out.println("===> " + str);
    System.out.println("===> " + str.toString());
    // 둘이 같은 코드
  }

  static void print(Date date) {
    System.out.println("===> " + date);
  }
  public static void main(String[] args) {
    print(100);
    print("홍길동");
    print(new Date(System.currentTimeMillis()));
  }

}
