package com.imooc.o2o.enums;

public enum ShopStateEnum {
    CHECK(0,"审核中"), OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),INNER_ERROR(-1001,"系统内部错误"),NULL_SHOPID(-1002,"ShopId为空"),
    NULL_SHOP(-1003,"shop信息为空");

    private int state;
    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    //依据传入的state值返回相应的enum值
    public static ShopStateEnum stateOf(int state){
        for(ShopStateEnum stateEnum: ShopStateEnum.values()){
            if(stateEnum.getState()==state){
                return  stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    //不需要set方法，因为不想让程序改变枚举实例的值
/*    public void setState(int state) {
        this.state = state;
    }*/

    public String getStateInfo() {
        return stateInfo;
    }

/*    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }*/
}
