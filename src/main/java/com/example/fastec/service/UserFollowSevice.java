package com.example.fastec.service;

import com.example.fastec.bean.UserFollow;
import com.example.fastec.mapper.UserFollowMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.example.fastec.mapper.UserFollowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class UserFollowSevice {

    @Autowired(required = false)
    private UserFollowMapper userFollowMapper;

    // 获取用户关注的列表
    public List<UserFollow> listUserFollowByOriginUid(int userId) {
        SelectStatementProvider ssp = select(id,alias,createTime,originUserId,targetUserId,updateTime).from(userFollow).
                where(originUserId, isEqualTo(userId)).build().render(RenderingStrategies.MYBATIS3);
        List<UserFollow> result = userFollowMapper.selectMany(ssp);
        return result;
    }

    public boolean follow(int originUid, int targetUid) {
        long currentTime = System.currentTimeMillis();
        UserFollow userFollow = new UserFollow();
        userFollow.setOriginUserId(originUid);
        userFollow.setTargetUserId(targetUid);
        userFollow.setCreateTime(currentTime);
        userFollow.setUpdateTime(currentTime);
        int updateCount = userFollowMapper.insert(userFollow);
        return updateCount > 0 ? true : false;
    }
}
