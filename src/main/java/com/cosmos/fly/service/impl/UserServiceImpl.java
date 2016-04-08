package com.cosmos.fly.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosmos.fly.domain.User;
import com.cosmos.fly.repository.UserRepository;
import com.cosmos.fly.service.api.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@Override
	public Long addUser(String name){
		
		User user = new User();
		user.setName(name);
		
		userRepository.save(user);
		return user.getId();
	}

	@Override
	public List<User> listUser(){
	
		Iterable<User> usersIterable = userRepository.findAll();
		Iterator<User> usersIterator = usersIterable.iterator();
		List<User> userList = new ArrayList<>();
		
		while(usersIterator.hasNext()){
			userList.add(usersIterator.next());
		}
		return userList;
	}
}
