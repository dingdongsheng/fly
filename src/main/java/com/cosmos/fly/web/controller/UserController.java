package com.cosmos.fly.web.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cosmos.fly.common.Result;
import com.cosmos.fly.common.util.Md5Util;
import com.cosmos.fly.domain.UserEntity;
import com.cosmos.fly.domain.beans.UserBean;
import com.cosmos.fly.service.api.UserService;

/**
 * Created by dingdongsheng on 16/3/24.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
  
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public Result<UserBean> register(String userName,String password) {
    	UserBean userBean = userService.addUser(userName,password);
    	return Result.success(userBean);
    }
    
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> listUser(String userName) {
    	return null;
    }
    
    
    
}
