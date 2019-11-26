package com.imooc.o2o.entity;

import java.util.Date;

//微信账号实体类
public class WechatAuth {
    //微信账号ID
    private Long whchatAuthId;
    //微信账号和公众号唯一标识符
    private String openId;
    //创建时间
    private Date createTime;
    //用户信息实体类
    private PersonInfo personInfo;

    @Override
    public String toString() {
        return "WechatAuth{" +
                "whchatAuthId=" + whchatAuthId +
                ", openId='" + openId + '\'' +
                ", createTime=" + createTime +
                ", personInfo=" + personInfo +
                '}';
    }

    public WechatAuth() {
    }

    public WechatAuth(Long whchatAuthId, String openId, Date createTime, PersonInfo personInfo) {
        this.whchatAuthId = whchatAuthId;
        this.openId = openId;
        this.createTime = createTime;
        this.personInfo = personInfo;
    }

    public Long getWhchatAuthId() {
        return whchatAuthId;
    }

    public void setWhchatAuthId(Long whchatAuthId) {
        this.whchatAuthId = whchatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
