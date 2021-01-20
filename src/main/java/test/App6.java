package test;

public class App6 {
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
    m.name = "임꺽정";
    m.age = 20;
    m.working = true;

    printMember(m);

    Member[] arr = new Member[3];

    arr[0] = new Member();
    arr[1] = new Member();
    arr[2] = new Member();

    arr[0].name = "홍길동";
    arr[0].age = 20;
    arr[0].working = false;

    arr[1].name = "임꺽정";
    arr[1].age = 30;
    arr[1].working = true;

    arr[2].name = "안중근";
    arr[2].age = 40;
    arr[2].working = true;

    printMember(arr[0]);
    printMember(arr[1]);
    printMember(arr[2]);
  }

  static void printMember(Member m) {
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n", m.age);
    System.out.printf("재직여부: %b\n", m.working);
    System.out.println("----------------------------------");
  }
}
