package com.test.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("html 요청");
		return "redirect:hello.html";
	}

}
