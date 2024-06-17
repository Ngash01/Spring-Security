package com.ngash.telusko.SpringSecurity.controller;

import com.ngash.telusko.SpringSecurity.Service.UserService;
import com.ngash.telusko.SpringSecurity.entity.User;
import com.ngash.telusko.SpringSecurity.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserModel userModel){
        return  userService.registerUser(userModel);
    }
}





