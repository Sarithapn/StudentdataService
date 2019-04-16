package com.webexample.springbootweb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webexample.springbootweb.model.studentdata;
import com.webexample.springbootweb.services.StudentServices;

@RestController
public class StudentController {
	@Autowired
	StudentServices service;
	
	@RequestMapping("hello")
	public ModelAndView hello(@RequestParam("name")String name)
	{//session.setAttribute("name",name+" requestParam");
		ModelAndView mv=new ModelAndView();
		System.out.println("hai"+name);
		mv.addObject("name",name);
		mv.setViewName("registerstudent");
		
		return mv;
	}
	@GetMapping("/students/{id}")
	public Optional<studentdata> getStudents(@PathVariable("id")int id)
	{
		System.out.println("in controller"+service.getRequiredStudentDetail(id));
		
		return service.getRequiredStudentDetail(id);
	}
	@GetMapping("/students")

	public List<studentdata> getAllStudents()
	{
		System.out.println("in controller"+service.getAllStudentDetails());
		return service.getAllStudentDetails();
	}
	
	@PostMapping("/students")
	public studentdata addStudent(@RequestBody studentdata student)
	{
		System.out.println("in controller");
		return service.SaveStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public studentdata updatestudent(@RequestBody studentdata student)
	{
		System.out.println("in controller");
		return service.SaveStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public String deletestudent(@PathVariable("id")int id)
	{
		System.out.println("in controller");
		return service.DeleteStudent(id);
	}

}
