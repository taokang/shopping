package com.imooc.o2o.entity;

import java.util.Date;

//本地账号实体类
public class LocalAuth {
    //本地账号ID；
    private Long localAuthId;
    //用户名
    private String username;
    //密码
    private String password;
    //本地账号创建时间
    private Date  createTime;
    //本地账号最后修改时间\
    private Date lastEditTime;
    //用户实体类
    private PersonInfo personInfo;

    @Override
    public String toString() {
        return "LocalAuth{" +
                "localAuthId=" + localAuthId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", personInfo=" + personInfo +
                '}';
    }

    public LocalAuth() {
    }

    public LocalAuth(Long localAuthId, String username, String password, Date createTime, Date lastEditTime, PersonInfo personInfo) {
        this.localAuthId = localAuthId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.personInfo = personInfo;
    }

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
