package com.jjang051.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/Test01.do")
	public String test01() {
		
		return "test01";
	}
	
	@GetMapping("/Test02.do")
	public String test02(HttpServletRequest request) {
		request.setAttribute("msg", "Hello Spring");
		
		return "test02";
	}
	
	@GetMapping("/Test03.do")
	public String test03(Model model) {
		model.addAttribute("msg", "Hello Spring");
		model.addAttribute("data", 100);
		
		return "test03";
	}
	
	@GetMapping("/Test04.do")
	public ModelAndView test04(ModelAndView mav) {
		mav.addObject("msg", "Hello Spring");
		mav.addObject("data", 100);
		mav.setViewName("test04");
		
		return mav;
	}
}
