package com.sist.mapper;

import com.sist.vo.BoardVO;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BoardMapper {

    @Select("SELECT no,title,name,content,hit," +
            "TO_CHAR(regdate, 'YYYY-MM-DD') as dbday FROM board "
            + "ORDER BY no DESC")
    public List<BoardVO> boardListData();
    
    @Select("SELECT no,title,name,content,hit," +
    		"TO_CHAR(regdate, 'YYYY-MM-DD') as dbday FROM board "
    		+ "WHERE no=#{no}")
    public BoardVO boardDetailData(int no);
    
    @Update("UPDATE board SET "
    		+ "hit=hit+1 "
    		+ "WHERE no=#{no}")
    public void boardHit(int no);
    
    @Insert("INSERT INTO board (no,title,name,content)"
    		+ "VALUES (board_no_seq.nextval,#{title},#{name},#{content})")
    public void boardInsert(BoardVO vo);
    
    @Update("UPDATE board SET "
    		+ "title=#{title}, content=#{content} "
    		+ "WHERE no=#{no}")
    public void boardUpdate(BoardVO vo);
    
    @Delete("DELETE FROM board "
    		+ "WHERE no=#{no}")
    public void boardDelete(int no);
}
