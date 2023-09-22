package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.OneToOneMappingRepository;
import com.spring.boot.entity.Student;

@Service
public class OneToOneMappingServiceImpl implements OneToOneMappingService {
	@Autowired
	private OneToOneMappingRepository oneToOneMappingRepository;
	
	@Override
	public List<Student> getAllStudent() {
		List<Student>  findAll = (List<Student>) oneToOneMappingRepository.findAll();
		return findAll;
	}

	@Override
	public Student saveStudent(Student student) {
		return oneToOneMappingRepository.save(student);
	}

}
