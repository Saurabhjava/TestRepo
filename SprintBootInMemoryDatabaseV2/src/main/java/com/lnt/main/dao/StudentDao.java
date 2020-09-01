package com.lnt.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.main.bean.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
