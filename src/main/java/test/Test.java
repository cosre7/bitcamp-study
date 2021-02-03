package test;

public class Test {
  static class Member {
    int no;
    String name;
    int age;
  }

  public static void main(String[] args) {

    Member obj = new Member();
    obj.no = 1;
    obj.name = "홍길동";
    obj.age = 20;

    Member obj2 = new Member();
    obj2.no = 1;
    obj2.name = "홍길동";
    obj2.age = 20;

    String s = obj.toString();
    System.out.println(s);

    System.out.println(obj);
    // s를 출력한 것과 같은 값
    // 굳이 위의 방법을 쓸 필요가 없다.

    int hashValue = obj.hashCode();
    // 10진수값
    System.out.println(hashValue);
    // 10진수를 16진수로
    System.out.println(Integer.toHexString(hashValue));
    System.out.printf("%x\n", hashValue);

    System.out.println(obj == obj2); //1
    System.out.println(obj.equals(obj2)); //2
    // 1과 2는 같다.
  }

}
