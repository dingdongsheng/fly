package com.cosmos.fly.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cosmos.fly.domain.User;
import com.cosmos.fly.service.api.UserService;

/**
 * Created by dingdongsheng on 16/3/24.
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(String userName, String password) {
        return new ModelAndView("login");
    }
    
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String addUser(String userName) {
    	
    	try{
    	
    	Long id = userService.addUser(userName);
        return id.toString();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "error";
    }
    
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<User> listUser(String userName) {
    	return userService.listUser();
      
    }
    
    
    
}
