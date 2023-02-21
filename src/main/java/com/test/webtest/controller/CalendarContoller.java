package com.test.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarContoller {

	@GetMapping("/calendar")
	public String calendar(Model model) {
		System.out.println("calendar 요청");
		model.addAttribute("title", "FullCarlendar");
		return "Calendar";
	}
}
