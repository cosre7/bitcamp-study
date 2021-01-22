package test.ex02;

public class App3 {
  public static void main(String[] args) {

    // 인스턴스와 가비지
    MyClass v1 = new MyClass();
    v1.b = 300;
    System.out.println(v1.b);

    // 다음과 같이 새 인스턴스를 만든 다음에
    // 그 주소를 v1에 저장하면,
    // 이전 인스턴스의 주소는 잃어 버린다.
    // 따라서 이전 인스턴스는 사용할 수 없다.
    // 이렇게 주소를 잃어버려 사용할 수 없는 인스턴스를 가비지라 부른다.
    v1 = new MyClass();
    System.out.println(v1.b);

    // 스태틱 변수 : 공통적으로 사용할 변수
    // 인스턴스 : non-static 으로 생성된 변수로 힙 영역에 저장되는 변수 (개별적으로 데이터를 각각 저장해야 될 때 사용)
    // 레퍼런스 : 인스턴스 변수의 주소가 저장되어 있는 변수
  }
}
