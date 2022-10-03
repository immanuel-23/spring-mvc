package com.aurionpro.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	//@RequestMapping("/text") if we put text here then url will not open then we have to put /text in url
	
	@RequestMapping("/show")
	public String showPage() {
		
		return "home-page";
	}
//	@RequestMapping("/")
//	public String showIndex() {
//		
//		return "index";
//	}
}
