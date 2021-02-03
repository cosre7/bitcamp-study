package test;

public class Test {
  static class Member {
    int no;
    String name;
    int age;
  }

  static class Board {
    int no;
    String title;
    String content;
  }

  public static void main(String[] args) {
    Object obj = new Member();

    System.out.println(obj instanceof Member);
    System.out.println(obj instanceof Object);
    System.out.println(obj instanceof Board);
  }

}
