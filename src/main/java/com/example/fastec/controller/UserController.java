package com.example.fastec.controller;

import com.example.fastec.bean.User;
import com.example.fastec.params.UserLoginParam;
import com.example.fastec.service.UserService;
import com.example.fastec.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody UserLoginParam userLoginParam) {
        User user = userService.login(userLoginParam);
        return ResponseResult.ok(user);
    }

}
