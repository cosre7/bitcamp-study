// #{} 과 ${} 차이점 => #{} 문법의 한계
// SQL문이 삽입되었기 때문에 오류가 발생한다.
package com.eomcs.mybatis.ex03.f;

import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream( 
        "com/eomcs/mybatis/ex03/f/mybatis-config.xml")).openSession();

    // 정렬 방식을 파라미터로 넘기기
    // => #{} 문법은 오직 값만 삽입할 수 있다.
    // => SQL 코드를 삽입할 수 없다.=> #{} 문법의 한계
    List<Board> boards = sqlSession.selectList("BoardMapper.selectBoard1", "desc");

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


