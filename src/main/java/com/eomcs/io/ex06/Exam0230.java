package com.eomcs.io.ex06;

public class Exam0230 {
  public static void main(String[] args) throws Exception {
    BufferedFileOutputStream out = new BufferedFileOutputStream("temp/data.bin");

    System.out.println("데이터 쓰는 중...");

    long start = System.currentTimeMillis();

    for (int i = 0; i < 1000000; i++) {
      out.write(0x55);
      // BufferedOutputStream은
      // 내부적으로 1바이트를 파일로 바로 출력하지 않고
      // 일단 byte[] 배열에 저장한다.
      // 바이트 배열이 꽉 찼을 때 파일로 출력한다.
      // 그래서 1바이트씩 파일로 바로 출력하는 것 보다 더 빠르다.
      // ex) 뷔페에서 음식을 접시에 담고 테이블에와서 다 먹고 다시 접시를 가지고 음식을 담는다.

      // 마치 1바이트씩 출력하는 느낌
      // Exam0220보다 조금 느리지만 비슷! 이게 더 편하다.
    }

    // BufferedOutputStream은 바이트 배열이 꽉 찼을 때만 파일로 출력하기 때문에0
    // 바이트 배열에 데이터가 남아 있을 경우 강제적으로 출력해야 한다.
    out.flush(); // 버퍼에 남아 있는 것을 방출한다. // 마지막 마무리
    // 원래 버퍼가 가득차야만 출력
    // 버퍼를 가득 채우지 못한 채 조금 남은 데이터 강제 출력!
    // out.flush(); 를 하지 않으면 1000000 용량이던 값이 999912로 줄어든다.

    long end = System.currentTimeMillis();

    out.close();

    System.out.println("출력 완료!");
    System.out.printf("경과된 시간: %d\n", end - start);
  }
}
