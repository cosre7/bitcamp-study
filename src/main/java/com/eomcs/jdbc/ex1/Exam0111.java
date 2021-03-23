// JDBC 드라이버 준비 - 드라이버 다운로드 및 로딩
package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0111 {

  public static void main(String[] args) {

    try {
      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();
      DriverManager.registerDriver(mariadbDriver);
      System.out.println("JDBC 드라이버 로딩 및 등록 완료!");

      // 등록되지 않은 드라이버를 찾을 경우 예외 발생!
      java.sql.Driver driver = DriverManager.getDriver("jdbc:oracle:thin:");
      System.out.println(driver);
      // mariaDB 등록 후 오라클을 찾는다? -> 예전 방식에서는 에러!
      // - registerDriver를 이용하여 mariadbDriver를 등록한 후
      //   getDriver로는 oracle을 호출하면 찾을 수 없다.

      // 최근의 mariadb, ms-sql, oracle의 경우 자동 등록되어 예외가 발생하지 않고
      // 바로 찾을 수 있게 바뀌었다.
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
