package com.webexample.springbootweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webexample.springbootweb.model.studentdata;
import com.webexample.springbootweb.studentRepositories.StudentRepo;

@Service
public class StudentServiceImple implements StudentServices {
	@Autowired
	StudentRepo dao;

	@Override
	public List<studentdata> getAllStudentDetails() {
		// TODO Auto-generated method stub
		System.out.println("in service");
		return dao.findAll();
	}

	@Override
	public Optional<studentdata> getRequiredStudentDetail(int id) {
		// TODO Auto-generated method stub
		System.out.println("in service");
		return dao.findById(id);

	}

	@Override
	public studentdata SaveStudent(studentdata student) {
		// TODO Auto-generated method stub
		System.out.println("in service");
		return dao.save(student);
	}

	@Override
	public String DeleteStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("in service");
		dao.deleteById(id);
		return "success";
	}

	
	

}
