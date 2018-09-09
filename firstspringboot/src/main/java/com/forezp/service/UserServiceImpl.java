package com.forezp.service;

import org.springframework.stereotype.Service;

import com.forezp.bean.User;

@Service
public class UserServiceImpl implements UserService {

    public User getUserById(String userNo) {
        User user = new User(userNo, "zs");
        return user;
    }

}
