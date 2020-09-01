package com.lnt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.bean.User;

@Repository
public class UserDao {
	private static List<User> users =new ArrayList<User>();
	private static int userCount=3;
	static {
		users.add(new User(1, "Aakash", "abc@gmail.com"));
		users.add(new User(2, "Dinesh", "xyz@gmail.com"));
		users.add(new User(3, "Mohammad", "mohammad@gmail.com"));
	}
	public List<User> findAll() {
		return users;
	}
	
	public User getUser(int uid) {
		for(User u:users) {
			if(u.getUid()==uid)
				return u;
		}
		return null;
	}
	
	public User save(User user) {
		if(user.getUid()==null) {
			user.setUid(++userCount);
		}
		users.add(user);
		return user;
	}
	public void deleteUSer(int uid) {
		Iterator<User> i=users.iterator();
		while(i.hasNext()) {
			User u=i.next();
			if(u.getUid()==uid) {
				i.remove();
			}
		}
	}
}





