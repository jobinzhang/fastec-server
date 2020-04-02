package com.example.fastec.service;

import com.example.fastec.bean.User;
import com.example.fastec.mapper.UserMapper;
import com.example.fastec.params.UserLoginParam;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.example.fastec.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

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
                render(RenderingStrategy.MYBATIS3);
        User user = userMapper.selectOne(provider).orElse(null);
        return user;
    }
}
