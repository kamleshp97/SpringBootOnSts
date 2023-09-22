package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Student;

public interface OneToOneMappingService {
	
	public List<Student> getAllStudent();
	public Student saveStudent(Student student);

}
