package a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon15552 {

  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    int N = Integer.parseInt(bufferedReader.readLine());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int sum = a + b;

      bufferedWriter.write(sum + "\n");
    }
    bufferedWriter.flush();

  }

}
