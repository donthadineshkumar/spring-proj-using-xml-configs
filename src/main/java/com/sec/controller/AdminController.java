package com.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value="admin")
public class AdminController {

	@RequestMapping("/home")
	public String home(){
		return "admin";		
	}
	
	
}
