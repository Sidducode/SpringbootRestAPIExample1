package com.example.SpringDemoExamp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringDemoExamp.entity.Student;
import com.example.SpringDemoExamp.service.StudentService;

@Service
public class StudentImpl implements StudentService{

	@Override
	public List<Student> findAll() {

		List<Student> student = new ArrayList<Student>();
		student.add(new Student(1,"sidd"));
		student.add(new Student(2,"king"));
		student.add(new Student(3,"Kohli"));
		return student;
	}

}
