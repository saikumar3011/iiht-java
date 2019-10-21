package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.demo.dao.StudentRepositroy;
import com.springboot.demo.models.Student;

@Controller
@RequestMapping ("/student")
public class StudentController {
	@Autowired
	private StudentRepositroy studentrepositroy;
	@RequestMapping(value ="/",method = RequestMethod.GET)
	public String studentlogin()
	{
		return "Studentlogin";
	}
	@RequestMapping(value = "/RegisterStudent",method =RequestMethod.GET)
	public String RegisterStudent(Model model){
	model.addAttribute("student", new Student());	

		return "StudentReg";
	
	}
	@RequestMapping(value="/studentReg",method = RequestMethod.POST)
	 public String addEmployee(@ModelAttribute("student") Student st) {
	 
	 
	 Student s= studentrepositroy.save(st);
	 
	 if(s!=null)
	 {
	 return "Studentlogin";
	 }
	 else
	 {
	 return "Index";
	 }
		}
	}
	
	

