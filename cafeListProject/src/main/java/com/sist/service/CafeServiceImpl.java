package com.sist.service;

import com.sist.dao.CafeDAO;
import com.sist.vo.CafeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class CafeServiceImpl implements CafeService {
    @Autowired
    CafeDAO cDao;

    @Override
    public List<CafeVO> cafeListData(Map map) {
        return cDao.cafeListData(map);
    }

    @Override
    public int cafeListCount(Map map) {
        return cDao.cafeListCount(map);
    }
}
