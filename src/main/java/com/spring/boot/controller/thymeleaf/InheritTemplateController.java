package com.spring.boot.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InheritTemplateController {

	@GetMapping("/getBasePage")
	public String getBasePage() {
		return "base";
	}
}
