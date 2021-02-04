package test;

import java.sql.Date;

public class Test {


  public static void main(String[] args) {
    int[] arr1 = new int[5];
    float[] arr2 = new float[5];

    arr1[0] = 100;
    // arr1[2] = 3.14f; -> 불가능

    Object[] arr3 = new Object[5];

    arr3[0] = new String("hello");
    arr3[1] = new Date(System.currentTimeMillis());
    arr3[2] = new StringBuffer("Hello");
    arr3[3] = Integer.valueOf(100);
    arr3[4] = Float.valueOf(3.14f);
    // 프리머티브 타입을 객체로 다룰 수 있다 -> wrapper 클래스의 장점
  }
}