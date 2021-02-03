package test;

public class Test {
  static class Member {
    int no;
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
      // TODO Auto-generated method stub
      return super.equals(obj);
    }
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

    System.out.println(obj.toString());
    System.out.println(obj2.toString());

    System.out.println(Integer.toHexString(obj.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj == obj2); //1
    System.out.println(obj.equals(obj2)); //2
  }

}
