package com.example.fastec.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final User user = new User();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = user.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = user.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = user.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> passwrod = user.passwrod;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> portrait = user.portrait;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = user.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sex = user.sex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> token = user.token;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pushId = user.pushId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> createTime = user.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> updateTime = user.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> lastReceiveMsg = user.lastReceiveMsg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> passwrod = column("passwrod", JDBCType.VARCHAR);

        public final SqlColumn<String> portrait = column("portrait", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sex = column("sex", JDBCType.INTEGER);

        public final SqlColumn<String> token = column("token", JDBCType.VARCHAR);

        public final SqlColumn<String> pushId = column("push_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> updateTime = column("update_time", JDBCType.BIGINT);

        public final SqlColumn<Long> lastReceiveMsg = column("last_receive_msg", JDBCType.BIGINT);

        public User() {
            super("t_user");
        }
    }
}