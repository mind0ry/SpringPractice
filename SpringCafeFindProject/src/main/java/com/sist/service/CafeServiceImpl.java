package com.sist.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.CafeDAO;
import com.sist.vo.CafeVO;

@Service
public class CafeServiceImpl implements CafeService{
	@Autowired
	private CafeDAO cDao;

	@Override
	public List<CafeVO> cafeListData(Map map) {
		// TODO Auto-generated method stub
		return cDao.cafeListData(map);
	}

	@Override
	public int cafeTotalPage(Map map) {
		// TODO Auto-generated method stub
		return cDao.cafeTotalPage(map);
	}
	
	
}
