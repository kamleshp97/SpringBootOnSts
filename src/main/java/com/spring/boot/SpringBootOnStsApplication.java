package com.spring.boot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.dao.UserRepository;
import com.spring.boot.entity.User;

@SpringBootApplication
public class SpringBootOnStsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootOnStsApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		User user = new User();
		/*
		 * user.setName("kamlesh"); user.setAddress("virar");
		 * user.setStatus("software engineer"); //save one User save = bean.save(user);
		 * //System.out.println( user.toString());
		 * 
		 * List<User> allNewUsers = Arrays.asList(new User("manish","byculla","doctor"),
		 * new User("bhbahi","byculla","doctor"), new User("papa","virar","gov emp"),
		 * new User("mammy","virar","god")); //save all users bean.saveAll(allNewUsers);
		 * 
		 * System.out.println("total entries ="+ bean.count());
		 */
		
		/*
		 * //delete one bean.deleteById(2);
		 * 
		 * 
		 * 
		 * //get one Optional<User> findById = bean.findById(1);
		 * 
		 * //get all user List<User> findAll = (List<User>) bean.findAll();
		 * System.out.println(findAll);
		 * 
		 * //get all user whose address is virar List<User> collect = findAll.stream()
		 * .filter(i -> i.getAddress().equals("virar")) .collect(Collectors.toList());
		 * System.out.println("collect: "+collect);
		 * 
		 * //delete user whom address is virar bean.deleteAll(collect);
		 * 
		 * //update //1. get entity whose data by id have to update then 2. get the data
		 * 3. set new value Optional<User> dataForUpdate = bean.findById(103); User
		 * dataForUpdate2 = dataForUpdate.get(); dataForUpdate2.setAddress("virar");
		 * bean.save(dataForUpdate2);
		 */
		/*
		 * System.out.
		 * println("--------------------- customm query finder ------------------------"
		 * ); List<User> findByName1 = bean.findByName("manish");
		 * System.out.println(findByName1);
		 * 
		 * List<User> findByNameAndAddress =
		 * bean.findByNameAndAddress("manish","byculla");
		 * System.out.println(findByNameAndAddress);
		 * 
		 * System.out.println("-------------------- JPQL -----------------------------"
		 * ); List<User> allUser = bean.getAllUser(); System.out.println(allUser);
		 * 
		 * List<User> data = bean.getData("manish", "doctor"); System.out.println(data);
		 * 
		 * System.out.println(bean.getAllUserNative());
		 */
	}

}
