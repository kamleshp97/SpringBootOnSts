package com.spring.boot.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {
	@GetMapping("/fragmentTest")
	public String fragmentTest(Model m) {
		m.addAttribute("name","manish");
		m.addAttribute("isLogin",false);
		return "fragmentMainPage";
	}

}
