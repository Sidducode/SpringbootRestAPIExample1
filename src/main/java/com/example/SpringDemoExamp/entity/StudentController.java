package com.example.SpringDemoExamp.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemoExamp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stdservice;

	@GetMapping("/students")
	public List<Student> retriveAllAtudents(){
		
		return stdservice.findAll();
		
	}
}
