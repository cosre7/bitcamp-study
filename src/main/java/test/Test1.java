package test;

import test.util.Calculator;
import test.util2.Calculator2;

public class Test1 {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2(); 
    //    c.plus(100);
    //    c.minus(20); 
    //    System.out.println(c.getResult());

    Calculator x = c;
    // 상위 분류는 하위 분류를 가리킬 수 있다.
    x.plus(200);
    //x.minus(300); // 범위는 Calculator의 범위로 한정된다.
    // minus는 Calculator2의 것이기 때문에 사용 불가.
    ((Calculator2) x).minus(300); // 형변환으로 사용 가능
    // x = Calculator2를 가리킬 때만 형변환으로 사용!
    // 컴파일러를 속이지 말자!!
    System.out.println(x.getResult());
  }
}
