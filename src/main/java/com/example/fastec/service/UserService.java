package com.example.fastec.service;

import com.example.fastec.bean.User;
import com.example.fastec.mapper.UserDynamicSqlSupport;
import com.example.fastec.mapper.UserMapper;
import com.example.fastec.params.UserLoginParam;
import com.example.fastec.params.UserRegisterParam;
import com.example.fastec.util.ConvertUtil;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.example.fastec.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User login(UserLoginParam userParam) {
        SelectStatementProvider provider = select(id, username, email, phone, password).
                from(user).
                where(username, isEqualTo(userParam.getUsername())).
                and(password, isEqualTo(userParam.getPassword())).
                build().
                render(RenderingStrategies.MYBATIS3);
        User user = userMapper.selectOne(provider).orElse(null);
        return user;
    }

    public User register(UserRegisterParam userRegisterParam) throws Exception {
        SelectStatementProvider selectStatementProvider = select(count()).
                from(user).
                where(username, isEqualTo(userRegisterParam.getUsername())).
                build().
                render(RenderingStrategies.MYBATIS3);
        long count = userMapper.count(selectStatementProvider);
        if (count > 0) {
            throw new Exception("用户名已经被注册");
        }

        User user = new User();
        ConvertUtil.convertRegisterUser(user, userRegisterParam);
        InsertStatementProvider<User> insertStatement = insert(user)
                .into(UserDynamicSqlSupport.user)
                .map(UserDynamicSqlSupport.id).toProperty("id")
                .map(username).toProperty("username")
                .map(email).toProperty("email")
                .map(phone).toProperty("phone")
                .map(password).toProperty("password")
                .build()
                .render(RenderingStrategies.MYBATIS3);
        userMapper.insert(insertStatement);
        return user;
    }
}
