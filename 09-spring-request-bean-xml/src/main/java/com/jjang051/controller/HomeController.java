package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Controller annotation을 달면 Spring Container 에 담긴다
// spring 에는 많은 annotation이 존재한다.

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("index");
		return "index";
	}
	
	@GetMapping("/Sub.do")
	public String sub() {
		System.out.println("sub");
		return "sub";
	}
}
