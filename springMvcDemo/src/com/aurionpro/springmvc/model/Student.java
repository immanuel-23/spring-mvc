package com.aurionpro.springmvc.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.sun.istack.internal.NotNull;
public class Student {
	
	@javax.validation.constraints.NotNull(message ="Enter valid number")
	@Min(value = 0, message="Must be 0 or more ")
	@Max(value = 8 ,message="Must be less than or equal to 8")
	private Integer atkt;
	
	@Pattern(regexp = "^([a-zA-Z0-9._]{5,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$", message="Enter valid email")
	private String email;
	
	@Pattern(regexp= "^[1-9]{6}", message="Enter valid ZipCode")
	private String zipCode;
	
	public  Integer getAtkt() {
		
		return atkt;
	}

	public void setAtkt(Integer atkt) {
		this.atkt = atkt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Size(min=1,message="pls enter First Name")
	private String firstName;
	@javax.validation.constraints.NotNull(message="please enter last name")
	@Size(min=1,message="pls enter Last Name")
	private String lastName;
	private String year;
	private String[] genders = { "Male", "Female" };
	private String selectedGender;

	public String[] getGenders() {
		return genders;
	}

	public void setGenders(String[] genders) {
		this.genders = genders;
	}

	public String getSelectedGender() {
		return selectedGender;
	}

	public void setSelectedGender(String selectedGender) {
		this.selectedGender = selectedGender;
	}

	private String[] selectedSubjects;
	private ArrayList<String> subjects;
	private LinkedHashMap<String, String> yearOption;

	public String[] getSelectedSubjects() {
		return selectedSubjects;
	}

	public void setSelectedSubjects(String[] selectedSubjects) {
		this.selectedSubjects = selectedSubjects;
	}

	private void addSubjects() {
		subjects = new ArrayList<String>();
		subjects.add("OS");
		subjects.add("DBMS");
		subjects.add("Java");
	}

	public ArrayList<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}

	public Student() {
		yearOption();
		addSubjects();
	}

	private void yearOption() {
		yearOption = new LinkedHashMap<String, String>();
		yearOption.put("2020", "2020");
		yearOption.put("2021", "2021");
		yearOption.put("2022", "2022");
	}

	public LinkedHashMap<String, String> getYearOption() {
		return yearOption;
	}

	public String getYear() {
		return year;
	}

	public void setYearOption(LinkedHashMap<String, String> yearOption) {
		this.yearOption = yearOption;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}