package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/Index.do")
	public String index() {
		return "board/index";
	}
	
	@GetMapping("/List.do")
	public String list() {
		return "board/list";
	}
	
	@GetMapping("/View.do")
	public String view() {
		return "board/iview";
	}
	@GetMapping("/Write.do")
	public String write() {
		return "board/write";
	}
	
	@GetMapping("/Update.do")
	public String update() {
		return "board/update";
	}
	
	@GetMapping("/Delete.do")
	public String delete() {
		return "board/delete";
	}
	
	@GetMapping("/ReplyWrite.do")
	public String replyWrite() {
		return "board/reply_write";
	}
	
	@GetMapping("/SearchList.do")
	public String searchList() {
		return "board/search_list";
	}
}
