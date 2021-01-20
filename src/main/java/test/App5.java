package test;

public class App5 {
  // 변수의 수가 적을 때 -> 그냥 낱개변수로 다뤄도 상관없음
  // 대량의 코드가 나올 때 -> 낱개변수로는 답이 없음
  // => class 라는 문법이 등장
  static class Member {
    // 메모리 설계도
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {
    // 회원정보를 저장할 새로운 메모리 구조를 설계한다.
    // => 사용자(개발자) 정의 데이터 타입
    // 

    Member m = new Member();
    m.name = "홍길동";
    m.age = 20;
    m.working = false;

    printMember(m);

    Member[] arr = new Member[3];
    arr[0] = new Member();
    arr[0].name = "홍길동";
    arr[0].age = 20;
    arr[0].working = false;

    printMember(arr[0]);

  }

  static void printMember(Member m) {
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n", m.age);
    System.out.printf("재직여부: %b\n", m.working);
    System.out.println("----------------------------------");
  }
}
