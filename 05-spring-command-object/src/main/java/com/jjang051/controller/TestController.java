package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jjang051.model.BoardDto;
import com.jjang051.model.DataDto;
import com.jjang051.model.MemberDto;

@Controller
public class TestController {
	
	@PostMapping("/Test01.do")
	public String test01(@ModelAttribute DataDto dataDto) {
		
		System.out.println("data01=== "+dataDto.getData01());
		System.out.println("data02=== "+dataDto.getData02());
		
		return "test01";
	}
	
	@PostMapping("/MemberTest.do")
	//public String test01(@ModelAttribute MemberDto memberDto) {
	public String memberTest(MemberDto memberDto) {
		
		System.out.println("no=== "+memberDto.getNo());
		System.out.println("id=== "+memberDto.getId());
		System.out.println("name=== "+memberDto.getName());
		System.out.println("password=== "+memberDto.getPassword());
		
		return "member";
	}
	
	@PostMapping("/MemberTest02.do")
	public String memberTest02(@ModelAttribute("testDto") MemberDto memberDto) {
		
		System.out.println("no=== "+memberDto.getNo());
		System.out.println("id=== "+memberDto.getId());
		System.out.println("name=== "+memberDto.getName());
		System.out.println("password=== "+memberDto.getPassword());
		
		return "member02";
	}
	
	@PostMapping("/BoardTest.do")
	//public String test01(@ModelAttribute BoardDto boardDto) {
	public String boardTest(BoardDto boardDto) {
		
		System.out.println("no=== "+boardDto.getNo());
		System.out.println("name=== "+boardDto.getName());
		System.out.println("subject=== "+boardDto.getSubject());
		System.out.println("password=== "+boardDto.getPassword());
		System.out.println("regDate=== "+boardDto.getRegDate());
		
		return "board";
	}
	
	@PostMapping("/BoardTest02.do")
	public String boardTest02(@ModelAttribute("testDto") BoardDto boardDto) {
	//public String boardTest(BoardDto boardDto) {
		
		System.out.println("no=== "+boardDto.getNo());
		System.out.println("name=== "+boardDto.getName());
		System.out.println("subject=== "+boardDto.getSubject());
		System.out.println("password=== "+boardDto.getPassword());
		System.out.println("regDate=== "+boardDto.getRegDate());
		
		return "board02";
	}
}








