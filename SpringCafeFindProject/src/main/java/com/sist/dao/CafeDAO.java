package com.sist.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.CafeMapper;
import com.sist.vo.CafeVO;

@Repository
public class CafeDAO {
	@Autowired
	private CafeMapper mapper;
	
	public List<CafeVO> cafeListData(Map map) {
		return mapper.cafeListData(map);
	}
	
	public int cafeTotalPage(Map map) {
		return mapper.cafeTotalPage(map);
	}
}
