package com.tamer.library.Service;

import java.util.List;

import com.tamer.library.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamer.library.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository ur;
	
	public User add(User user)
	{
		return ur.save(user);
	}
	

	public List<User> getAll()
	{
		return ur.findAll();
	}
}
