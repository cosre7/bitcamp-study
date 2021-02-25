// 인스턴스 입출력 - 'transient' modifier
// modifier(변경자): 본래의 성격을 바꾼다.
package com.eomcs.io.ex11.e;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam0510 {

  public static void main(String[] args) throws Exception {
    FileOutputStream fileOut = new FileOutputStream("temp/score.data");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

    Score s = new Score();
    s.name = "홍길동";
    s.kor = 99;
    s.eng = 80;
    s.math = 92;
    s.compute();

    // 데이터 왜곡
    // serialize 대상에서 제외된 필드(trabsient가 붙은 필드)는
    // 다음과 같이 임의로 값을 설정해봐야 소용없다.
    // - 어차피 출력되지 않는다.
    s.sum = 300;
    s.aver = 100.0f;

    // serialize 할 때 transient가 붙은 필드의 값은 제외된다.
    out.writeObject(s);

    out.close();
    System.out.println("출력 완료!");
  }

}


