package com.cosmos.fly.service.api;

import java.util.List;

import com.cosmos.fly.domain.UserEntity;
import com.cosmos.fly.domain.beans.UserBean;

public interface UserService {

	UserBean addUser(String name,String pwd);

	List<UserBean> listUser();

}
