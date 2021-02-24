// Byte Stream - 텍스트 데이터 읽기
package com.eomcs.io.ex02;

import java.io.FileInputStream;

public class Exam0520 {

  public static void main(String[] args) throws Exception {
    StringBuffer strbuf = new StringBuffer();

    FileInputStream in = new FileInputStream("sample/ms949.txt");

    int b = 0;

    // 한글은 2바이트, 영어는 1바이트로 읽어서 출력하게 만들기

    // MS949로 인코딩된 텍스트 읽기
    // - 단순히 1바이트를 읽어서는 안된다.
    // - 영어는 1바이트를 읽으면 되지만,
    //   한글은 2바이트를 읽어야 한다.
    while ((b = in.read()) != -1) {
      if (b >= 0x81) { // 읽은 바이트가 한글에 해당한다면
        // 1바이트를 더 읽어서 기존에 읽은 바이트 뒤에 붙여 2바이트로 만든다.
        b = b << 8 | in.read(); // | 는 + 와 같이 쓰였다.
      }
      System.out.printf("%x\n", b);
    }

    in.close();

    System.out.println(strbuf.toString());
  }

}
