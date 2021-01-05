package a;

import java.util.Scanner;

public class Baekjoon2577 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    in.close();

    int[] counts = new int[10];
    int result = a * b * c;

    while (result > 0) {
      counts[result % 10]++;
      result /= 10;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(counts[i]);
    }

  }

}
