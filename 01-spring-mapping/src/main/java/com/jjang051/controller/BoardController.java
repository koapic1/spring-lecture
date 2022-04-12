package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	@RequestMapping(value = "/List.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String list() {
		System.out.println("list 호출");
		return "board/list";
	}

	@RequestMapping(value = "/Write.do", method = RequestMethod.GET)
	public String write() {
		System.out.println("write 호출");
		return "board/write";
	}
	
	@RequestMapping(value = "/Delete.do", method = RequestMethod.GET)
	public String delete() {
		System.out.println("delete 호출");
		return "board/delete";
	}
	
	@RequestMapping(value = "/Update.do", method = RequestMethod.GET)
	public String update() {
		System.out.println("update 호출");
		return "board/update";
	}
}
