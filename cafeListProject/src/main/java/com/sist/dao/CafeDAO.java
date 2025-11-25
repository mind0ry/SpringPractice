package com.sist.dao;

import com.sist.mapper.CafeMapper;
import com.sist.vo.CafeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CafeDAO {
    /*
    @Select("SELECT no,korname,engname FROM cafe_menu " +
            "WHERE ${column} LIKE '%'||#{ss}||'%'")
    public List<CafeVO> cafeListData(Map map);

    @Select("SELECT COUNT(*) FROM cafe_menu " +
            "WHERE ${column} LIKE '%'||#{ss}||'%'")
    public int cafeListCount(Map map);
     */
    @Autowired
    CafeMapper mapper;

    public List<CafeVO> cafeListData(Map map) {
        return mapper.cafeListData(map);
    }

    public int cafeListCount(Map map) {
        return mapper.cafeListCount(map);
    }
}
