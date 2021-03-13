package a;

import java.util.Scanner;
public class Baekjoon2438 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <=i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}

