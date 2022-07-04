package com.example.SpringDemoExamp.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.SpringDemoExamp.entity.Student;


public interface StudentService {

	public List<Student> findAll();
}
