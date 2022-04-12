package com.jjang051.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub")
public class SubController02 {
	@RequestMapping(value = "/Sub03.do", method = RequestMethod.GET)
	public String sub03() {
		System.out.println("sub03 호출");
		return "sub02/sub03";
	}
	
	@RequestMapping(value = "/Sub04.do", method = RequestMethod.GET)
	public String sub04() {
		System.out.println("sub04 호출");
		return "sub02/sub04";
	}
}
