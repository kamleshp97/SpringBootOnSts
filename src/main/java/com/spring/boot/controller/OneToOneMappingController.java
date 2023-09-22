package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Student;
import com.spring.boot.service.OneToOneMappingService;

@RestController
public class OneToOneMappingController {
	@Autowired
	private OneToOneMappingService oneMappingService;
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> allStudent = oneMappingService.getAllStudent();
		if(allStudent.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(allStudent);
	}
	
	@PostMapping("/saveStudents")
	public ResponseEntity<Student> saveStudents(@RequestBody Student student){
		System.out.println("STUDENT: "+student);
		Student student2 = oneMappingService.saveStudent(student);
		return ResponseEntity.ok(student2);
	}

}
