package test.ex06;

public class App {
  public static void main(String[] args) {
    // 식1: 2 * 3 + 7 - 2 = 11
    // 식2: 12 / 4 - 5 = -2

    Calculator r1 = new Calculator();
    Calculator r2 = new Calculator();

    r1.result = 0;
    r2.result = 0;

    r1.plus(2);
    r1.multiple(3);
    r1.plus(7);
    r1.minus(2);

    r2.plus(12);
    r2.divide(4);
    r2.minus(5);

    // 기본적으로 필요한 값 = r1 (앞에 표시)
    // 추라적으로 필요한 값 = 2, 3, ... (파라미터로 표시)

    // ++
    // a++ 과 같은 방식

    // result + 2
    // r1 + 2
    // r1 plus(2)
    // r1.plus(2)

    System.out.println(r1.result);
    System.out.println(r2.result);
  }
}
