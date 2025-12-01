package com.sist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.vo.CafeVO;

public interface CafeMapper {

	@Select("SELECT no,image,engname,korname,description,kcal,num "
			+ "FROM (SELECT no,image,engname,korname,description,kcal,rownum as num "
			+ "FROM (SELECT no,image,engname,korname,description,kcal "
			+ "FROM cafe_menu ORDER BY no ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<CafeVO> cafeListData(@Param("start") int start, @Param("end") int end);
	
	@Select("SELECT CEIL(COUNT(*)/8.0) FROM cafe_menu")
	public int cafeTotalPage();
}
