package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import com.sun.javafx.font.PrismFontFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ShopDaoTest {
    @Autowired
    private  ShopDao shopDao;

    @Test
    public void testInsertShop(){
        System.out.println("insertShop test!");
        Shop shop=new Shop();
        ShopCategory shopCategory=new ShopCategory();
        Area area=new Area();
        PersonInfo personInfo=new PersonInfo();

        personInfo.setUserId((long) 1);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1L);

        shop.setOwner(personInfo);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺");
        shop.setShopDesc("test1");
        shop.setShopAddr("test2");
        shop.setPhone("test3");
        shop.setShopImg("test4");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        System.out.println(shopDao.insertShop(shop));
    }
}
