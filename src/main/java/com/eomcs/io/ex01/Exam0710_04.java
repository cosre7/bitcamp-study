// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_04 {

  public static void main(String[] args) throws Exception {

    // 결과 예)
    // /Users/bitcamp/git/test
    // src/
    //   main/
    //     java/
    //       com/
    //         Hello.java
    //         Hello2.java
    // build.gradle
    // settings.gradle
    // Hello.java
    // ...

    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());

    printList(dir);
  }

  static void printList(File dir) {
    // 현재 디렉토리의 하위 파일 및 디렉토리 목록을 알아낸다.
    File[] files = dir.listFiles();

    // 리턴 받은 파일 배열에서 이름을 꺼내 출력한다.
    for (File file : files) {
      if (file.isDirectory() && !file.isHidden()) { // 디렉토리이고 히든폴더가 아닌 것
        System.out.printf("%s/\n", file.getName());
      } else if (file.isFile()){ // 파일인 경우 // 그냥 else를 해버리면 .git 폴더가 나타나버린다.
        System.out.printf("%s\n", file.getName());
      }
    }
  }
}


