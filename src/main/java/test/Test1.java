package test;

import test.util2.Calculator2;

public class Test1 {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2(); 
    c.plus(100);
    c.plus(100, 200);
    c.minus(20); 
    c.minus(30, 40);
    //    c.plus(3.14f); //float 타입은 정의하지 않았으므로 에러!
    System.out.println(c.getResult());
  }
}
