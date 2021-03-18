package a;

import java.util.Scanner;

public class Baekjoon10951 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      System.out.println(A+B);
    }

    in.close();
  }
}
