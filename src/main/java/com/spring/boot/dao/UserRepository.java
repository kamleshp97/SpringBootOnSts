package com.spring.boot.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.boot.entity.User;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {
	
	//custom query finder
	List<User> findByName(String name); //for methodName follow format
	
	//AND
	List<User> findByNameAndAddress(String name, String address); //for methodName follow format
	
	//Using JPQL
	@Query("SELECT u FROM User u")  //at place of tablename use entity class name
	public List<User> getAllUser();//anyMethodName

	//conditional query
	@Query("SELECT m FROM User m WHERE m.name=:n1 and m.status=:n2")
	public List<User> getData(@Param("n1") String name, @Param("n2") String status);
	
	//Using Native Query
	@Query(value = "SELECT * FROM User210923", nativeQuery = true) 
	public List<User> getAllUserNative();//anyMethodName
	
}
