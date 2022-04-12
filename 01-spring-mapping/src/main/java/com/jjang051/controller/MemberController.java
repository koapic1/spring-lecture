package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("List.do")
	public String list() {
		return "member/list";
	}
	
	@GetMapping("Write.do")
	public String write() {
		return "member/write";
	}
	
	@GetMapping("Delete.do")
	public String delete() {
		return "member/delete";
	}
	
	@GetMapping("Update.do")
	public String update() {
		return "member/update";
	}
}
