package com.eomcs.net.ex11.myStep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중");

      try (Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());) {

        sendIntroMessage(out);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void sendIntroMessage(PrintStream out) throws Exception {
    out.println("[계산기 서비스]");
    out.println("계산기 서버에 오신 것을 환영합니다!");
    out.println("계산식을 입력하세요");
    out.println("예) 23 + 7");
    out.println();
    out.flush();
  }
}
