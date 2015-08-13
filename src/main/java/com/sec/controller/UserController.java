package com.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping("/home")
	public String home(){
		System.out.println("In user home method");
		return "user";		
	}
	
	
}
