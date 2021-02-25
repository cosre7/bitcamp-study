// 인스턴스 읽기 - 배열 활용
package com.eomcs.io.ex12.a;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test02_2 {

  public static void main(String[] args) throws Exception {

    // score.data 파일에서 세 학생의 데이터를 읽어 Score 인스턴스로 생성하라.
    // => java.io.BufferedInputStream 클래스를 사용하라.
    // => java.io.DataInputStream 클래스를 사용하라.
    //

    FileInputStream in0 = new FileInputStream("temp/score.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    DataInputStream in = new DataInputStream(in1);

    int len = in.readInt();
    Score[] students = new Score[len];

    for (int i = 0; i < students.length; i++) {
      Score s = new Score(); // 인스턴스가 여러개 = 메모리가 여러개 => 반복문 돌 때 마다 인스턴스 만드는 것
      // 하나의 인스턴스에 하나의 성적 정보를 담는 것
      // => 인스턴스를 여러개 만들어서 여러개 성적 정보를 받아야 한다.
      // 만약 인스턴스를 하나만 만들고난 후 성적 정보를 아무리 많이 받아봤자
      // 마지막 성적 정보만 담긴다.
      // => 반복문으로 같이 돌면서 만들어져야 한다.
      s.setName(in.readUTF());
      s.setKor(in.readInt());
      s.setEng(in.readInt());
      s.setMath(in.readInt());
      students[i] = s;
    }

    in.close();

    // 그리고 세 학생의 정보를 다음과 같은 형식으로 출력하라.
    // =>   홍길동, 100, 100, 100, 300, 100 
    // 

    for (Score s : students) {
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
          s.getName(), s.getKor(), s.getEng(), s.getMath(),
          s.getSum(), s.getAver());
    }
  }

}
