package com.spring.boot.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

	@GetMapping("/firstThymelaf")
	public String getFirstThymeleaf(Model model) {
		model.addAttribute("name", "kamlesh");
		model.addAttribute("surname", "prajapati");
		model.addAttribute("age", 30);
		return "firstThymeleaf";
	}
}
