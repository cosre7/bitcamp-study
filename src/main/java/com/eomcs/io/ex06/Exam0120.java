// 버퍼 사용 후 - 데이터 읽는데 걸린 시간 측정
package com.eomcs.io.ex06;

import java.io.FileInputStream;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    byte[] buf = new byte[8192]; // 보통 8KB 정도 메모리를 준비한다. //한번에 8000바이트 읽음
    // 서버 프로그램에서 1인당 할당해주는 메모리 용량으로 생각
    // 한번에 8000바이트 필요한 프로그램 -> 10명이 쓰면 80000바이트 필요
    // 메모리를 크게 잡을 수록 여러명이 동시 접속했을 때 필요한 메모리가 늘어난다
    // => 균형점이 필요하다 => 보통 8kb로 생각된다.
    // 서버 프로그램이기 때문에 이런 생각이 필요하다
    // 컴퓨터 자체의 프로그램일 경우 메모리 크기가 커도 큰 상관이 없다.
    int len = 0;

    long startTime = System.currentTimeMillis(); // 밀리초

    int callCount = 0;
    while ((len = in.read(buf)) != -1) {
      callCount++; // 파일을 끝까지 읽는다.
    }

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
  }

}
