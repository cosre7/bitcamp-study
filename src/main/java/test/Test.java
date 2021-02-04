package test;

public class Test {
  static class A {
    int a = 100;
    int b = 200;
    void m1() {
      System.out.println("A.m1()");
    }

    void m2() {
      System.out.println("A.m2()");
    }
    void print() {
      System.out.printf("%d, %d\n", a, b);
    }
  }

  static class B extends A {
    int a = 111;
    int c = 222;
    @Override
    void m1() {
      System.out.println("B.m1()");
    }

    void m3() {
      System.out.println("B.m3()");
    }
  }

  public static void main(String[] args) {
    A obj = new B();
    obj.m1();
    obj.m2();
    // obj.m3(); // 컴파일러는 문법 그대로 검사한다. 
    // obj는 어떤 객체 주소가 들어있는지 고려하지 않는다. 

  }
}
