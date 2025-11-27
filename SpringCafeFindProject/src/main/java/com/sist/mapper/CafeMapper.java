package com.sist.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.vo.CafeVO;

public interface CafeMapper {

	@Select("SELECT no,cno,korname,engname,image,description,num "
			+ "FROM (SELECT no,cno,korname,engname,image,description,rownum as num "
			+ "FROM (SELECT no,cno,korname,engname,image,description "
			+ "FROM cafe_menu "
			+ "WHERE ${column} LIKE '%'||#{fd}||'%' "
			+ "ORDER BY no ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<CafeVO> cafeListData(Map map);
	
	@Select("SELECT CEIL(COUNT(*)/8.0) FROM cafe_menu "
			+ "WHERE ${column} LIKE '%'||#{fd}||'%'")
	public int cafeTotalPage(Map map);
	
}
