package com.test.webtest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	// GET: SELECT 조회 
	@GetMapping("/webtest")
	public String httpGet() {
		return "GET 요청 처리";
	}
	
	// POST: INSERT 등록 
	@PostMapping("/webtest")
	public String httpPost() {
		return "POST 요청 처리";
	}
	
	// PUT: UPDATE 수정
	@PutMapping("/webtest") 
	public String httpPut() {
		return "PUT 요청 처리";
	}
	
	// DELETE: DELETE 삭제
	@DeleteMapping("/webtest")
	public String httpDelete() {
		return "DELETE 요청 처리";
	}
}
