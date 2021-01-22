package test.ex03;

public class App {
  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 = 11
    //
    Calculator.result = 0;
    // 초기화 안해도 어차피 0이지만 그냥

    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.plus(7);
    Calculator.minus(2);

    System.out.println(Calculator.result);
  }
}
