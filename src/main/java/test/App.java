package test;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);

    String name = null;

    System.out.print("이름? ");
    name = keyboardScan.nextLine();

    keyboardScan.close();

    System.out.printf("%s님 반갑습니다!\n", name);
  }
}
