package test;

import java.util.Scanner;

public class NameHandler {
  static String name = null;

  static void inputName() {
    Scanner keyboardScan = new Scanner(System.in);
    System.out.print("이름? ");
    name = keyboardScan.nextLine();
    keyboardScan.close();
  }

  static void printName() {
    System.out.printf("%s님 반갑습니다!\n", name);
  }
}
