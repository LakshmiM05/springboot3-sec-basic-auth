package com.example.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContentController {
	
	@GetMapping("/home")
	public String getHomeContent() {
		return "home";
	}
	
	@GetMapping("/admin/home")
	public String getAdminHomeContent() {
		return "admin-home";
	}
	
	@GetMapping("/user/home")
	public String getUserHomeContent() {
		return "user-home";
	}

	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	

}
