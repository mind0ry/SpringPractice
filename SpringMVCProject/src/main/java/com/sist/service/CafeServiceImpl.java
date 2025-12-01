package com.sist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.CafeDAO;
import com.sist.vo.CafeVO;

@Service
public class CafeServiceImpl implements CafeService {
	@Autowired
	private CafeDAO cDao;

	@Override
	public List<CafeVO> cafeListData(int start, int end) {
		// TODO Auto-generated method stub
		return cDao.cafeListData(start, end);
	}

	@Override
	public int cafeTotalPage() {
		// TODO Auto-generated method stub
		return cDao.cafeTotalPage();
	}

}
