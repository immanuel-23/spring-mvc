package com.aurionpro.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("test")
public class TestController {
	
	//@RequestMapping("/text") if we put text here then url will not open then we have to put /text in url
	
	@RequestMapping("show")
	public String showPage() {
		
		return "test-page";
	}
	@RequestMapping("/showform")
	public String showform() {
		
		return "test-form";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model) {
		String  studentName=request.getParameter("studentName");
		model.addAttribute("student",studentName);
		
		return "form-details";
	}
	@RequestMapping("/processForm2")
	public String processForm2(@RequestParam("studentName") String studentName,Model model) {
		//String  studentName=request.getParameter("studentName");
		 //@RequestParam("studentName") is doing here injection
		
		model.addAttribute("student",studentName);
		
		return "form-details";
	}
	
}
