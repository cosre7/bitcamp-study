// 리턴 문장에 람다(lambda) 활용
package com.eomcs.oop.ex12;

public class Exam0410 {

  static interface Interest {
    double compute(int money);
  }

  static Interest getInterest(final double rate) {
    // 로컬 클래스로 인터페이스 구현한 후 객체 리턴하기
    //    class InterestImpl implements Interest {
    //      double rate;
    //
    //      public InterestImpl(double rate) {
    //        this.rate = rate;
    //      }
    //
    //      @Override
    //      public double compute(int money) {
    //        return money + (money * rate / 100);
    //      }
    //    }
    //    return new InterestImpl(rate);

    // 로컬 변수
    //    class InterestImpl implements Interest {
    //      double rate;
    //
    //      @Override
    //      public double compute(int money) {
    //        return money + (money * rate / 100);
    //      }
    //    }
    //    return new InterestImpl();

    // 익명클래스
    //    Interest i = new Interest() {
    //      @Override
    //      public double compute(int money) {
    //        return money + (money * rate / 100);
    //      }
    //    };
    //    return i;

    // 객체 리턴
    //    return new Interest() {
    //      @Override
    //      public double compute(int money) {
    //        return money + (money * rate / 100);
    //      }
    //    };

    // 람다
    return money -> money + (money * rate / 100);
  }

  public static void main(String[] args) {
    Interest i1 = getInterest(1.5); // 1.5% 이자 계산
    System.out.printf("금액: %.2f\n", i1.compute(1_0000_0000));

    Interest i2 = getInterest(2.5);
    System.out.printf("금액: %.2f\n", i2.compute(1_0000_0000));
  }

}


