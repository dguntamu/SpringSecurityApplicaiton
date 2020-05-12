package com.ssecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class SpringSecurityController {
	@RequestMapping("/")
	public String getMsg() {
		return ("<h1> Welcome </h1>");
	}

	@RequestMapping("/user")
	public String userAthurisation() {
		return ("<h1> Welcome User</h1>");
	}

	@RequestMapping("/admin")
	public String adminAthurisation() {
		return ("<h1> Welcome Admin</h1>");
	}
}
