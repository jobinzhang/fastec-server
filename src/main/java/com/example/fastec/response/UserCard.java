package com.example.fastec.response;

import com.example.fastec.bean.User;

/**
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public class UserCard {

    private int id;
    private String name;
    private String phone;
    private String portrait;
    private String desc;
    private int sex = 0;
    // 用户关注人的数量
    private int follows;
    // 用户粉丝的数量
    private int following;
    // 我与当前User的关系状态，是否已经关注了这个人
    private boolean isFollow;
    // 用户信息最后的更新时间
    private long modifyAt;

    public UserCard(final User user, boolean isFollow) {
        this.isFollow = isFollow;
        this.id = user.getId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.portrait = user.getPortrait();
        this.desc = user.getDescription();
        this.sex = user.getSex();
        this.modifyAt = user.getUpdateTime();

        // TODO 得到关注人和粉丝的数量
        // user.getFollowers().size()
        // 懒加载会报错，因为没有Session

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public boolean isFollow() {
        return isFollow;
    }

    public void setFollow(boolean follow) {
        isFollow = follow;
    }

    public long getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(long modifyAt) {
        this.modifyAt = modifyAt;
    }
}
