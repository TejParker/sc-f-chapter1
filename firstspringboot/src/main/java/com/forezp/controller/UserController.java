package com.forezp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.bean.User;
import com.forezp.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    String getUserById(@RequestParam(defaultValue = "1001") String userNo) {
        User user = userService.getUserById(userNo);
        System.out.println("************userNo=" + userNo + ",user=" + user.toString());
        return user.toString();
    }

}
