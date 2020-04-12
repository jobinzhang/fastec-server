package com.example.fastec.service;

import com.example.fastec.bean.User;
import com.example.fastec.mapper.UserMapper;

import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.fastec.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isLike;
import static org.mybatis.dynamic.sql.SqlBuilder.select;


@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;


    /*public User login(UserLoginParam userParam) {
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
    }*/

    public User getUserByUid(int uid) {
        return userMapper.selectByPrimaryKey(uid).orElse(null);
    }

    public List<User> searchUserByName(String queryString) {
        SelectStatementProvider ssp = select(id, name, phone, passwrod, portrait, description, sex, token, pushId, createTime, updateTime, lastReceiveMsg).
                from(user).where(name, isLike(queryString)).
                build().render(RenderingStrategies.MYBATIS3);
        List<User> users = userMapper.selectMany(ssp);
        return users;
    }
}
