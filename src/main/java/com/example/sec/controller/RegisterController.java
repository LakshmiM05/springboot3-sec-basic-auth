package com.example.sec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sec.entity.MyUser;
import com.example.sec.repository.MyRepository;

@RestController
public class RegisterController {
	@Autowired
	private MyRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@PostMapping("/register/user")
	public MyUser saveUser(@RequestBody MyUser myUser) {
		myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
		return repository.save(myUser);
	}

}
