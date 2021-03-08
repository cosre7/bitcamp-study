package com.eomcs.net.ex11.myStep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {

    try (Scanner keyboardScanner = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      receiveResponse(in);

      while (true) {
        String input = keyboardScanner.nextLine();
        sendRequest(out, input);
        receiveResponse(in);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void sendRequest(PrintStream out, String message) throws Exception {
    out.println(message);
    out.flush();
  }
  static void receiveResponse(BufferedReader in) throws Exception {
    while (true) {
      String input = in.readLine();
      if (input.length() == 0) {
        break;
      }
      System.out.println(input);
    }
  }
}
