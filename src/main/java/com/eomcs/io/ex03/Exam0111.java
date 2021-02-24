// character stream - 출력할 문자 집합 설정하기
package com.eomcs.io.ex03;

import java.io.FileWriter;
import java.nio.charset.Charset;

public class Exam0111 {
  public static void main(String[] args) throws Exception {

    System.out.println(Charset.isSupported("EUC-KR"));
    // EUC-KR을 사용할 수 있는지 확인하는 코드

    // 1) 출력 스트림 객체를 생성할 때  문자 집합을 지정하면 
    //    UCS2 문자열을 해당 문자집합으로 인코딩 한다.
    Charset charset = Charset.forName("EUC-KR"); 
    // 기억하기 -> 파일 인코딩에 상관 없이 charset으로 변환해서 출력하고 싶을 때 사용하기!
    FileWriter out = new FileWriter("temp/test2.txt", charset);

    // 현재 JVM 환경 변수 'file.encoding' 값 알아내기
    System.out.printf("file.encoding=%s\n", System.getProperty("file.encoding")); 
    // Charset을 설정했으면 위의 코드는 무시된다. 
    // -> 이클립스에서 진행하는 encoding을 무시하고 설정한 Charset을 따른다.

    // UCS2에서 한글 '가'는 ac00이다.
    out.write(0x7a6bac00); 
    // - 앞의 2바이트(7a6b)는 버린다.
    // - 뒤의 2바이트(ac00)은 MS949(b0a1) 코드 값으로 변환되어 파일에 출력된다.

    // UCS2에서 영어 'A'는 0041이다.
    out.write(0x7a5f0041);  // 
    // - 앞의 2바이트(7a5f)는 버린다.
    // - 뒤의 2바이트는 MS949(41) 코드 값으로 변환되어 파일에 출력된다.

    out.close();

    System.out.println("출력 완료!");

  }
}
