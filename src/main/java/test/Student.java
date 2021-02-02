package test;

public class Student extends Member {
  String school;
  String major;

  @Override
  // 저장하면 자동으로 적힌다
  // 목적: 상속받은 메서드가 서브 클래스에 맞지 않으니까
  // 서브 클래스의 역할에 맞춰서 재정의하는 문법

  void print() {
    super.print();
    // superClass의 print를 호출
    // 재정의하기 전 print 호출
    System.out.printf("%s,%s 학과\n", this.school, this.major);
  }
}
