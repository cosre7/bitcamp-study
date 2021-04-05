// Dynamic SQL - where 태그 사용법
package com.eomcs.mybatis.ex04.c;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("검색 항목:\n  1. 제목\n  2. 내용\n검색 항목? ");
    int menuNo = Integer.parseInt(keyboard.nextLine());

    //    if (!(menuNo == 1 || menuNo == 2)) { // 검색 항목 번호가 1번도 아니고 2번도 아니라면
    //      System.out.println("검색 항목 번호가 올바르지 않습니다.");
    //      keyboard.close();
    //      return;
    //    }

    System.out.print("검색어? ");
    String keyword = keyboard.nextLine();

    keyboard.close();

    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream( 
        "com/eomcs/mybatis/ex04/c/mybatis-config.xml")).openSession();

    // <where> 태그 안에 놓이는 SQL이 없을 경우 // 예) 검색 항목? 3 이라고 했을 때
    // where 절은 삽입되지 않는다.
    //
    //  select 
    //    board_id, 
    //    title,
    //    contents,
    //    created_date,
    //    view_count
    //  from x_board
    //  order by board_id desc => 이 상태로 실행된다. ==> 오류가 발생하지 않게된다.
    // 
    HashMap<String,Object> params = new HashMap<>();
    params.put("menuNo", menuNo);
    params.put("keyword", keyword);

    List<Board> boards = sqlSession.selectList("BoardMapper.select0120", params);

    for (Board b : boards) {
      System.out.printf("%d,%s,%s,%s,%d\n", 
          b.getNo(),
          b.getTitle(),
          b.getContent(),
          b.getRegisteredDate(),
          b.getViewCount());
    }

    sqlSession.close();
  }
}


