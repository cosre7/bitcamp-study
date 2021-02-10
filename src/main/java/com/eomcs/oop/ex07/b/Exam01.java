// 추상 클래스와 추상 메서드의 활용: 적용 전
package com.eomcs.oop.ex07.b;

import java.util.Arrays;

public class Exam01 {

  static int[] createRandomNumbers(final int size) {
    // final -> size의 값을 바꿀 수 없도록 방지하는 문법
    // 파라미터 -> 외부에서 받은 값을 내부에서 사용하는 것
    // -> 바뀌면 안될 때 final을 붙인다.
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = i;
    }

    int count = size >> 1;
    for (int i = 0; i < count; i++) {
      // 나누기 2 = >> 1
      // 랜덤한 숫자를 섞는 과정
      int index1 = (int) (Math.random() * size);
      int index2 = (int) (Math.random() * size);
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {

    int[] values = createRandomNumbers(100);
    // 그냥 복제해서 새 배열을 만듬
    int[] values2 = Arrays.copyOf(values, values.length);

    BubbleSort s1 = new BubbleSort();
    QuickSort s2 = new QuickSort();

    // 두 개의 정렬 객체가 서로 다른 타입이기 때문에
    // 정렬을 수행하고 출력할 메서드를 따로 따로 만들어야 한다.
    // 클래스의 사용법도 달라서 불편하다.
    // BubbleSort 객체는 run()을 호출해야 하고,
    // QuickSort 객체는 start()를 호출해야 한다.
    //
    display(s1, values);
    display(s2, values2);
  }

  // 정렬을 수행하는 객체와 값을 주면
  // 그 값을 정렬한 후 출력하는 메서드이다.
  static void display(BubbleSort sorter, int[] values) {

    System.out.println("[정렬 전]");
    printNumbers(values);

    // BubbleSort 사용법에 맞춰 정렬을 수행한다.
    long start = System.currentTimeMillis();

    sorter.run(values);

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    // 정렬된 값을 출력한다.
    System.out.println("[정렬 후]-----------------------------");
    printNumbers(values);
  }

  static void display(QuickSort sorter, int[] values) {

    System.out.println("[정렬 전]");
    // 정렬되기 전 값을 출력한다.
    printNumbers(values);

    long start = System.currentTimeMillis();

    // QuickSort 사용법에 맞춰 정렬을 수행한다.
    sorter.start(values, 0, values.length - 1);

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    // 정렬된 값을 출력한다.
    System.out.println("[정렬 후]-----------------------------");
    printNumbers(values);
  }

  static void printNumbers(int[] values) {
    for (int value : values) {
      System.out.print(value + ",");
    }
    System.out.println();
  }
}






