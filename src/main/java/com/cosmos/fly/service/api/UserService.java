package com.cosmos.fly.service.api;

import java.util.List;

import com.cosmos.fly.domain.User;

public interface UserService {

	Long addUser(String name);

	List<User> listUser();

}
