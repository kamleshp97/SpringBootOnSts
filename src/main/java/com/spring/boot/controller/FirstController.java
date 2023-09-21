package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("testing!!");
		return "NewFile";
	}
}
