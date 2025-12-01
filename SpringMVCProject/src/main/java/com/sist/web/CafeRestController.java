package com.sist.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sist.service.CafeService;
import com.sist.vo.CafeVO;

@RestController
public class CafeRestController {
	@Autowired
	private CafeService cService;
	
	@GetMapping(value = "cafe/list_vue.do", produces = "text/plain;charset=UTF-8")
	public String cafe_list_vue(int page) {
		
		String result="";
	
		final int ROWSIZE=8;
		int start=(ROWSIZE*page)-(ROWSIZE-1);
		int end=(ROWSIZE*page);
		List<CafeVO> list=cService.cafeListData(start, end);
		int totalpage=cService.cafeTotalPage();
		
		final int BLOCK=10;
		int startPage=((page-1)/BLOCK*BLOCK)+1;
		int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage)
			endPage=totalpage;
		
		Map map=new HashMap();
		map.put("list", list);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("curpage", page);
		map.put("totalpage", totalpage);
		
		try {
			ObjectMapper mapper=new ObjectMapper();
			result=mapper.writeValueAsString(map);
		} catch (Exception e) {}
		
		return result;
	}
}
