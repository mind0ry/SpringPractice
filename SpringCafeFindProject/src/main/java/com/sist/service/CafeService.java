package com.sist.service;

import java.util.List;
import java.util.Map;

import com.sist.vo.CafeVO;

public interface CafeService {
	
	
	public List<CafeVO> cafeListData(Map map);
	
	public int cafeTotalPage(Map map);
}
