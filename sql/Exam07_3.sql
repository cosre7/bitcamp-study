/* as 로 컬럼에 별명(라벨명) 붙이기  */

/* 출력 라벨명을 변경하기
   => 라벨명을 지정하지 않으면 컬럼명이 라벨명이 된다*/
select rno as room_no, loc as location, name
from room;

/* as 생략 가능 */
select rno room_no, loc location, name
from room;

/* 라벨명에 공백을 넣고 싶으면 '' 안에 작성한다. -> 그냥 하면 에러!*/
-- 왠만하면 그냥 _ 쓰자
select rno 'room no', loc location, name
from room;

/* 복잡한 형식으로 출력할 경우 라벨명(별명)을 부여한다.
    예) 강의실명(지점명)*/
select concat(name, '(', loc, ')')
from room;

-- 별명 붙이기
select concat(name, '(', loc, ')') title
from room;

select count(*)
from room;

-- 별명 붙이기
select count(*) cnt
from room;

-- room 테이블의 데이터 중 loc='서초'인 개수
select count(*) cnt
from room
where loc='서초';
