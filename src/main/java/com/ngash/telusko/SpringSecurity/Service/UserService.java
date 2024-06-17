package com.ngash.telusko.SpringSecurity.Service;

import com.ngash.telusko.SpringSecurity.entity.User;
import com.ngash.telusko.SpringSecurity.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User registerUser(UserModel userModel);

}


