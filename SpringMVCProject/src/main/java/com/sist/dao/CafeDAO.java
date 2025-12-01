package com.sist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.CafeMapper;
import com.sist.vo.CafeVO;

@Repository
public class CafeDAO {
	@Autowired
	private CafeMapper mapper;
	
	public List<CafeVO> cafeListData(int start,int end) {
		 return mapper.cafeListData(start,end);
	}
	
	public int cafeTotalPage() {
		return mapper.cafeTotalPage();
	}
}
