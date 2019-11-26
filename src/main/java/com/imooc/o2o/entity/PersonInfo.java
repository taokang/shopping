package com.imooc.o2o.entity;

import java.util.Date;

//用户信息的实体类
public class PersonInfo {
    //用户ID
    private Long userId;
    //用户姓名
    private String name;
    //用户的头像地址
    private String profileImg;
    //邮箱
    private String email;
    //性别
    private String gender;
    //用户状态，比如账号被禁用，不能登陆商城进行任何操作，默认值为0，表示禁用，不能登陆商城，如果为1就表示可以登陆
    private Integer enableStatus;
    //用户类别，1代表顾客  2代表店家  3代表超级管理员  默认值为1，顾客
    private Integer userType;
    //用户创建时间
    private Date createTime;
    //最近的一次操作时间
    private Date lastEditTime;

    @Override
    public String toString() {
        return "PersonInfo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", enableStatus=" + enableStatus +
                ", userType=" + userType +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    public PersonInfo() {
    }

    public PersonInfo(Long userId, String name, String profileImg, String email, String gender, Integer enableStatus, Integer userType, Date createTime, Date lastEditTime) {
        this.userId = userId;
        this.name = name;
        this.profileImg = profileImg;
        this.email = email;
        this.gender = gender;
        this.enableStatus = enableStatus;
        this.userType = userType;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
