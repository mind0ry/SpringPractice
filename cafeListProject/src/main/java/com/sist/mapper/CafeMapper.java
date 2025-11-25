package com.sist.mapper;

import com.sist.vo.CafeVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CafeMapper {
    @Select("SELECT no,korname,engname FROM cafe_menu " +
            "WHERE ${column} LIKE '%'||#{ss}||'%'")
    public List<CafeVO> cafeListData(Map map);

    @Select("SELECT COUNT(*) FROM cafe_menu " +
            "WHERE ${column} LIKE '%'||#{ss}||'%'")
    public int cafeListCount(Map map);
}
