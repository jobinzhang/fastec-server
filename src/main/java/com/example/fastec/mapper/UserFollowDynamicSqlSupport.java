package com.example.fastec.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserFollowDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UserFollow userFollow = new UserFollow();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = userFollow.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> alias = userFollow.alias;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> createTime = userFollow.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> originUserId = userFollow.originUserId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> targetUserId = userFollow.targetUserId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> updateTime = userFollow.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UserFollow extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> alias = column("alias", JDBCType.VARCHAR);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> originUserId = column("origin_user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> targetUserId = column("target_user_id", JDBCType.INTEGER);

        public final SqlColumn<Long> updateTime = column("update_time", JDBCType.BIGINT);

        public UserFollow() {
            super("t_user_follow");
        }
    }
}