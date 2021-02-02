package test;

import test.util2.Calculator2;

public class Test1 {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2(); 
    c.plus(100);
    c.minus(20); 
    System.out.println(c.getResult());
  }
}
