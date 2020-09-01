package com.lnt.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.main.bean.Student;
import com.lnt.main.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("students")
	public List<Student> getAll(){
		return studentService.getAllStudents();
	}
}
