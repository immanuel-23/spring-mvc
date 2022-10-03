package com.aurionpro.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aurionpro.springmvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@InitBinder
	public void intiBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/showStudentForm") // it will work as dispatcher
	public String showStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("theStudent", student);
		return "student-form";
	}

	@RequestMapping("/processStudentForm")
	public String processForm(@Valid @ModelAttribute("theStudent") Student student, BindingResult bindingResult) {
//		System.out.println(bindingResult);
//		System.out.println(student);//@model attribute get the details of the form submite
		// @VALID WILL validated model attribute then put it into binding result and
		// binding result will always be after model attribute
		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			return "student-details";

		}
	}

}
