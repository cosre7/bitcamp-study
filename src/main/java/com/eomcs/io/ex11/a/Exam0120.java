// 인스턴스 입출력 - DataInputStream으로 인스턴스 읽기
package com.eomcs.io.ex11.a;

import java.io.DataInputStream; // Data Processing Stream Class = Decorator
import java.io.FileInputStream; // Data Sink Stream Class = Concrete Component

public class Exam0120 {

  public static void main(String[] args) throws Exception {

    FileInputStream fileIn = new FileInputStream("temp/member.data");
    DataInputStream in = new DataInputStream(fileIn);

    Member member = new Member();

    // 데이터 출력 순서 중요 -> file format
    // 출력 순서에 맞춰서 읽어야만 한다!
    member.name = in.readUTF();
    member.age = in.readInt();
    member.gender = in.readBoolean();

    in.close();

    System.out.println(member);
  }
}


