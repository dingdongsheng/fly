package com.example.myproject.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dingdongsheng on 16/3/24.
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(String userName, String password) {
        return new ModelAndView("login");
    }
}
