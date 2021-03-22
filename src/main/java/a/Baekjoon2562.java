package a;

import java.util.Scanner;

public class Baekjoon2562 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[9];
    int index = 0; 
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();

      if (arr[i] > max) {
        max = arr[i];
        index = i + 1;
      }
    }

    in.close();

    System.out.println(max);
    System.out.println(index);
  }

}
