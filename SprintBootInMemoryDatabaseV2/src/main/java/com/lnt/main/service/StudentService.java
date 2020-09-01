package com.lnt.main.service;

import java.util.List;
import java.util.Optional;

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
	public Student findStudent(Integer id) {
		Optional<Student> op=studentDao.findById(id);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	public void saveStudent(Student student) {
		studentDao.save(student);
	}
	public void delStudent(int sid) {
		Optional<Student> op=studentDao.findById(sid);
		studentDao.delete(op.get());
	}
	public void updateStudent(Student student) {
		studentDao.save(student);
	}
}




