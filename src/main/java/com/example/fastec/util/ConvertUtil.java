package com.example.fastec.util;

import com.example.fastec.bean.User;
import com.example.fastec.params.UserRegisterParam;

public class ConvertUtil {

    public static void convertRegisterUser(User user, UserRegisterParam userRegisterParam) {
        if (user == null || userRegisterParam == null) {
            return;
        }
        user.setEmail(userRegisterParam.getEmail());
        user.setPassword(userRegisterParam.getPassword());
        user.setPhone(userRegisterParam.getPhone());
        user.setUsername(userRegisterParam.getUsername());
    }
}
