package com.example.fastec.bean;

import javax.annotation.Generated;

public class UserFollow {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String alias;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer originUserId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer targetUserId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAlias() {
        return alias;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getOriginUserId() {
        return originUserId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOriginUserId(Integer originUserId) {
        this.originUserId = originUserId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getTargetUserId() {
        return targetUserId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTargetUserId(Integer targetUserId) {
        this.targetUserId = targetUserId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}