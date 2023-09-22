package com.spring.boot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student220923")
public class Student {
	@Id
	private int rollNo;
	private String studentName;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Marks marks;
	
	
	public Student() {}
	public Student(int rollNo, String studentName, Marks marks) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	
}
