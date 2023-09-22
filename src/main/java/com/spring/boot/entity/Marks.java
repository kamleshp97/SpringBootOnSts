package com.spring.boot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="marks220923")
public class Marks {
	@Id
	private int rollNo;
	private int hindi;
	private int marathi;
	private int english;
	private int science;
	private int mathematics;
	private int socialScience;
	@OneToOne(mappedBy = "marks")
	@JsonBackReference
	private Student student;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getMarathi() {
		return marathi;
	}
	public void setMarathi(int marathi) {
		this.marathi = marathi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMathematics() {
		return mathematics;
	}
	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}
	public int getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Marks() {}
	public Marks(int rollNo, int hindi, int marathi, int english, int science, int mathematics, int socialScience,
			Student student) {
		super();
		this.rollNo = rollNo;
		this.hindi = hindi;
		this.marathi = marathi;
		this.english = english;
		this.science = science;
		this.mathematics = mathematics;
		this.socialScience = socialScience;
		this.student = student;
	}
	
	
	
}
