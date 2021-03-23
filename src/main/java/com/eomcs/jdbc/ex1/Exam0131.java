// JDBC 드라이버 준비 - 드라이버 클래스 로딩과 등록
package com.eomcs.jdbc.ex1;

import java.io.FileReader;
import java.sql.DriverManager;
import java.util.Properties;

public class Exam0131 {

  public static void main(String[] args) {
    try {
      // properties 파일을 만들어서 값을 쏙쏙 뽑아낼 수 있다.
      Properties props = new Properties();
      props.load(new FileReader("./jdbc-driver.properties"));
      System.out.println(props.getProperty("jdbc.driverClassName"));
      // jdbc.driverClassName: 뽑고싶은 값의 변수명
      System.out.println(props.getProperty("jdbc.url"));
      // jdbc.url: 뽑고싶은 값의 변수명

      Class.forName(props.getProperty("jdbc.driverClassName"));
      java.sql.Driver driver = DriverManager.getDriver(props.getProperty("jdbc.url"));
      System.out.println(driver);
      // properties 파일만 뜯어고치면 내용이 바뀐다 => soft coding

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


