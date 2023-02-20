package com.test.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("html 요청");
		return "redirect:hello.html";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jps 요청");
		model.addAttribute("username", "yunjin");
		return "hello";
	}

}
