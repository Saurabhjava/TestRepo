package com.lnt.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("students/{id}")
	public Student getStudent(@PathVariable Integer id){
		return studentService.findStudent(id);
	}
	@PostMapping("students")
	public void createStudent(@RequestBody Student student){
		studentService.saveStudent(student);
	}
	@DeleteMapping("students/{sid}")
	public void deleteStudent(@PathVariable Integer sid){
		studentService.delStudent(sid);
	}
	@PutMapping("students")
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
	}
}
