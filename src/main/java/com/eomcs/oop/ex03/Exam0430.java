// 생성자 - 여러 개의 생성자 정의하기 
package com.eomcs.oop.ex03;

public class Exam0430 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    Score() {
      System.out.println("Score()");
    }

    Score(String name) {
      System.out.println("Score(String)");
      this.name = name;
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("Score(String,int,int,int) 호출!");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }

    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }

  public static void main(String[] args) {

    // 생성자가 여러 개 일 때 파라미터에 전달하는 값으로 구분한다.
    Score s1 = new Score();

    // 인스턴스 생성 후에 나중에 따로 생성자를 호출할 수 없다!
    // new 했을 때만 호출된다.
    //s1.Score("홍길동", 100, 90, 77); // 컴파일 오류!

    Score s2 = new Score("유관순");
    Score s3 = new Score("홍길동", 100, 90, 77);
    //Score s4 = new Score(true); // 논리 값을 받는 생성자는 없다!

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.average);
  }
}

// 생성자?
// => 인스턴스(객체)를 생성한 후, 쓰이기 전에 유효한 값으로 초기화시키는 작업을 수행한다.
// 

// ex -> 모니터 구매 -> 초기 밝기 50%정도로 미리 맞춰놔야 한다 -> 생성자를 통해 미리 밝기를 조절
// ex -> 쓰레기통 구매 -> 초기에는 빈통으로
// ex -> 자동차 구매 -> 초기에 일정량의 기름은 넣어져 있어야 한다
// 제품 중 0으로 셋팅해야 할 제품이 있고 -> 기본값 주지 않기
// 기본적인 값(유효한 값)이 들어가있어야 할 제품이 있다. -> 생성자를 통해 초기화
// 프로그램 세계에서도 같다. 객체의 쓰임에 따라서 기본값이 필요한 경우가 있고
// 필요하지 않은 경우가 있다. -> 결정은 프로그래머가

// new ProjectHandler(memberList) -> memberList가 있어야 ProjectHandler를 사용할 수 있다
// ProjectHandler 안에 memberList 내용이 포함되어 있기 때문
// -> 생성자를 이용해서 유효한 값으로 초기화 시킨 후에 작업이 수행될 수 있도록 함







