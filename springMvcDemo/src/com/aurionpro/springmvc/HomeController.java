package com.aurionpro.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//@RequestMapping("/text") if we put text here then url will not open then we have to put /text in url
	
	@RequestMapping("/")
	public String showPage() {
		
		return "home-page";
	}
}
