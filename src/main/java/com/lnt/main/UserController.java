package com.lnt.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.bean.User;
import com.lnt.dao.UserDao;

@RestController
public class UserController {
	
	@Autowired
	private UserDao udao;
	
	@GetMapping("hello")
	public String sayHello() {
		return "Hello Spring Boot Rest";
	}
	//Getting all users
	@GetMapping("users")
	public List<User> getAllUser() {
		return udao.findAll();
	}
	//Getting user by user id
	@GetMapping("users/{uid}")
	public User getUser(@PathVariable int uid) {
		return udao.getUser(uid);
	}
	@PostMapping("users")
	public void createUser(@RequestBody User user) {
		User u=udao.save(user);
	}
	@DeleteMapping("users/{uid}")
	public void createUser(@PathVariable int uid) {
		udao.deleteUSer(uid);
	}
}





