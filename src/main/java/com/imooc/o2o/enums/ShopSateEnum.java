package com.imooc.o2o.enums;

public enum ShopSateEnum {
    CHECK(0,"审核中"), OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),INNER_ERROR(-1001,"系统内部错误"),NULL_SHOPID(-1002,"ShopId为空");

    private int state;
    private String stateInfo;

    private ShopSateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
