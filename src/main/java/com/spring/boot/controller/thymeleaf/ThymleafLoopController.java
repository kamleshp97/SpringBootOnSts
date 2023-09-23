package com.spring.boot.controller.thymeleaf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafLoopController {

	@GetMapping("/loop")
	public String loopThymleaf(Model model) {
		List<String> list = Stream.of("kamlesh","manish","bhabhi","papa","mammy").collect(Collectors.toList());
		model.addAttribute("list", list);
		return "loopPage";
	}
	
	@GetMapping("/conditon")
	public String conditonThymleaf(Model model) {
		model.addAttribute("gender", "Male");
		model.addAttribute("isACTIVE", true);
		List<String> list = Stream.of("kamlesh","manish","bhabhi","papa","mammy").collect(Collectors.toList());
		model.addAttribute("list", list);
		return "conditonPage";
	}
}
