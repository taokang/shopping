package com.imooc.o2o.dto;

import com.imooc.o2o.entity.Shop;

import java.util.List;

public class ShopExecution {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //店铺数量
    private int count;

    //操作的shop（增删改店铺的时候用到）
    private Shop shop;

    //shop列表（查询店铺列表的时候使用）
    private List<Shop> shopList;

    public ShopExecution() {
    }

}
