package com.sist.web;

import com.sist.dao.BoardDAO;
import com.sist.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("board/")
public class BoardController {
    @Autowired
    private BoardDAO dao;

    @GetMapping("list.do")
    public String board_list(Model model) {

        List<BoardVO> list=dao.boardListData();
        model.addAttribute("list", list);
        
        return "board/list";
    }
    
    @GetMapping("detail.do")
    public String board_detail(int no, Model model) {
    	
    	dao.boardHit(no);
    	BoardVO vo=dao.boardDetailData(no);
    	
    	model.addAttribute("vo",vo);
    	
    	return "board/detail";
    }
    
    @GetMapping("insert.do")
    public String board_insert() {
    	
    	return "board/insert";
    }
    
    @PostMapping("insert_ok.do")
    public String board_insert_ok(BoardVO vo) {
    	
    	dao.boardInsert(vo);
    	
    	return "redirect:list.do";
    }
    
    @GetMapping("update.do")
    public String board_update(int no, Model model) {
    	
    	BoardVO vo=dao.boardDetailData(no);
    	model.addAttribute("vo",vo);
    	
    	return "board/update";
    }
    
    @PostMapping("update_ok.do")
    public String board_update_ok(BoardVO vo) {
    	
    	dao.boardUpdate(vo);
    	
    	return "redirect:detail.do?no="+vo.getNo();
    }
    
    @GetMapping("delete.do")
    public String board_delete(int no) {
    	
    	dao.boardDelete(no);
    	
    	return "redirect:list.do";
    }
}
