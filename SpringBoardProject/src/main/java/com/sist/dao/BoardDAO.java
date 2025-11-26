package com.sist.dao;

import com.sist.mapper.BoardMapper;
import com.sist.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    private BoardMapper mapper;

    public List<BoardVO> boardListData() {
        return mapper.boardListData();
    }
    
    public BoardVO boardDetailData(int no) {
    	return mapper.boardDetailData(no);
    }
    
    public void boardHit(int no) {
    	mapper.boardHit(no);
    }
    
    public void boardInsert(BoardVO vo) {
    	mapper.boardInsert(vo);
    }
    
    public void boardUpdate(BoardVO vo) {
    	mapper.boardUpdate(vo);
    }
    
    public void boardDelete(int no) {
    	mapper.boardDelete(no);
    }
}
