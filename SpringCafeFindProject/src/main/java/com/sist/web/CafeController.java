package com.sist.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.service.CafeService;
import com.sist.vo.CafeVO;

@Controller
public class CafeController {
	@Autowired
	private CafeService service;
	
	@RequestMapping("cafe/list.do") 
	public String cafe_list(String page, String column, String fd, Model model) {
		
		if(page==null)
			page="1";
		
		if(column==null)
			column="korname";
		
		if(fd==null)
			fd="라떼";
		
		int curpage=Integer.parseInt(page);
		
		final int ROWSIZE=8;
		
		Map map=new HashMap();
		map.put("fd", fd);
		map.put("column", column);
		map.put("start", (curpage*ROWSIZE)-(ROWSIZE-1));
		map.put("end", (curpage*ROWSIZE));
		
		List<CafeVO> list=service.cafeListData(map);
		int totalpage=service.cafeTotalPage(map);
		
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		
		if(endPage>totalpage) 
			endPage=totalpage;
		
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("list", list);
		
		model.addAttribute("fd", fd);
		model.addAttribute("column", column);
		
		return "cafe/list";
	}
	
}
