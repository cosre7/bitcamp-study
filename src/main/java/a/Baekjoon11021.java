package a;

import java.util.Scanner;

public class Baekjoon11021 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 1; i <= T; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.printf("Case #%d: %d\n", i, a+b);
    }
  }
}
