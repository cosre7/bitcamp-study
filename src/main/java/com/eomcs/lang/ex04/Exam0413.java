package com.eomcs.lang.ex04;

//# 정수 변수 - 크기가 다른 변수끼리 값 할당
//
public class Exam0413 {  
  public static void main(String[] args) {
    long l = 100;
    int i = 100;
    short s = 100;
    byte b = 100;
    char c = 100;

    // 저장되는 값은 100으로 모두 동일하지만 데이터타입이 다르기 때문에 컴파일 시 다른 수로 
    // 생각이 되어지면서 컴파일되기 때문에 컴파일 오류가 발생한다.

    //변수의 값을 다른 변수에 저장할 때,
    //- 값의 크기에 상관없이 같거나 큰 크기의 메모리이어야 한다.

    long l2;
    int i2;
    short s2;
    byte b2;
    char c2;

    // long ===> long 이상
    l2 = l;
    //i2 = l; // 컴파일 오류
    //s2 = l; // 컴파일 오류
    //b2 = l; // 컴파일 오류!
    //c2 = l; // 컴파일 오류!

    // int ===> int 이상
    l2 = i;
    i2 = i;
    //s2 = i; // 컴파일 오류!
    //b2 = i; // 컴파일 오류!
    //c2 = i;  // 컴파일 오류!

    // short ===> short 이상
    l2 = s;
    i2 = s;
    s2 = s;
    //b2 = s; // 컴파일 오류!
    //c2 = s; // 컴파일 오류! char(0 ~ 65535) | int(-32768 ~ 32767)

    // byte ===> byte 이상
    l2 = b;
    i2 = b;
    s2 = b;
    b2 = b;
    //c2 = b; // 컴파일 오류! char(0 ~ 65535) | byte(-128 ~ 127)
  }
}
