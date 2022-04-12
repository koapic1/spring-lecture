package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("/List.do")
	public String list() {
		return "member/list";
	}
	
	@GetMapping("/Login.do")
	public String login() {
		return "member/login";
	}
	
	@GetMapping("/LogOut.do")
	public String logout() {
		return "member/logout";
	}
	
	@GetMapping("/Update.do")
	public String update() {
		return "member/update";
	}
	
	@GetMapping("/Delete.do")
	public String delete() {
		return "member/delete";
	}
	
	@GetMapping("/Join.do")
	public String join() {
		return "member/join";
	}
	
	@GetMapping("/Info.do")
	public String info() {
		return "member/info";
	}
}
