package com.lnt.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.main.bean.Student;
import com.lnt.main.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}
}
