package test;
// Hello 패키지로 Hello! 와 반갑습니다!를 분리한다
// main 메소드에서 Hello 메소드를 호출한다.
public class App2 {

  public static void main(String[] args) {
    Hello();
  }

  static void Hello() {
    System.out.println("Hello!");
    System.out.println("반갑습니다!");
  }
}
