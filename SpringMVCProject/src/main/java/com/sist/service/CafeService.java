package com.sist.service;

import java.util.List;

import com.sist.vo.CafeVO;

public interface CafeService {

	public List<CafeVO> cafeListData(int start,int end);
	public int cafeTotalPage();
}
