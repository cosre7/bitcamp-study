package test;

public class A {

  void m1(B b) {
    B b = new B();
    b.y();
  }

  void m2() {
    // B.x(); -> 가능
    obj.y();
  }
}
