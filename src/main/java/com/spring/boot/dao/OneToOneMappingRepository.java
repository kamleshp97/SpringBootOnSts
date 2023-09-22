package com.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.entity.Student;

public interface OneToOneMappingRepository extends CrudRepository<Student, Integer>{

}
