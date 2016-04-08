package com.cosmos.fly.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosmos.fly.common.util.Md5Util;
import com.cosmos.fly.domain.UserEntity;
import com.cosmos.fly.domain.beans.UserBean;
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
	public UserBean addUser(String name,String pwd){
		
		String md5Pwd = Md5Util.md5(pwd);
		String randomStr = UUID.randomUUID().toString();
    	String token = Md5Util.md5(randomStr);
		
		UserEntity user = new UserEntity();
		user.setName(name);
		user.setPassword(md5Pwd);
		user.setToken(token);
		
		userRepository.save(user);
		
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(user, userBean);
		return userBean;
	}

	@Override
	public List<UserBean> listUser(){
	
		Iterable<UserEntity> usersIterable = userRepository.findAll();
		Iterator<UserEntity> usersIterator = usersIterable.iterator();
		List<UserBean> userList = new ArrayList<>();
		
		while(usersIterator.hasNext()){
			UserBean userBean = new UserBean();
			UserEntity userEntity = usersIterator.next();
			BeanUtils.copyProperties(userEntity, userBean);
			userList.add(userBean);
		}
		return userList;
	}
}
