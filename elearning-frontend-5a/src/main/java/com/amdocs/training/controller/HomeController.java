package com.amdocs.training.controller;

//import java.awt.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {																					
    
	@GetMapping("/")
	public String indexPage() {
	return "index";
	}
//	public String indexPage(Model model) {
//		model.addAttribute("message", "hello guys");
//		List<String> names = Arrays.asList("Mohit","bharat");
//		return "index";
//	}
}
