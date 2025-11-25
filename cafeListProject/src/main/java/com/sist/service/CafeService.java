package com.sist.service;

import com.sist.vo.CafeVO;

import java.util.List;
import java.util.Map;

public interface CafeService {
    /*
    public List<CafeVO> cafeListData(Map map) {
        return mapper.cafeListData(map);
    }

    public int cafeListCount(Map map) {
        return mapper.cafeListCount(map);
    }
     */
    public List<CafeVO> cafeListData(Map map);
    public int cafeListCount(Map map);
}
