package com.test.webtest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data							// Getter, Setter, ToString 
@NoArgsConstructor				// 기본 생성자 생성
@AllArgsConstructor				// 모든 멤버변수 초기화하는 생성자 생성
@Builder						// 빌더 패턴이 적용된 builder() 메소드 생성
public class User {	

	private int id;				// 회원 일련번호
	private String username;	// 아이디
	private String password;	// 비밀번호
	private String email;		// 이메일
}
