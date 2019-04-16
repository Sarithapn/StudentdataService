package com.webexample.springbootweb.services;

import java.util.List;
import java.util.Optional;

import com.webexample.springbootweb.model.studentdata;

public interface StudentServices {
	List<studentdata> getAllStudentDetails();
	Optional<studentdata> getRequiredStudentDetail(int id);
	studentdata SaveStudent(studentdata student);
	String DeleteStudent(int id);
	
}
