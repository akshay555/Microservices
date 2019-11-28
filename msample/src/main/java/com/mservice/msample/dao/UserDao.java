package com.mservice.msample.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mservice.msample.bean.User;

@Component
public class UserDao {

	public static int COUNT = 3;
	private static List<User> users = new ArrayList<>();

	static {

		users.add(new User(123, "Akshay", new Date()));
		users.add(new User(567, "Ragav", new Date()));
		users.add(new User(656, "Uty", new Date()));
		users.add(new User(787, "UIO", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++COUNT);
			users.add(user);
		}
		users.add(user);
		return user;
	}

	public User finaOne(int id)
	{
		for(User user : users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		
		}
		return null;
		
	}
	


}
