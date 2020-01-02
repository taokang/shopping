package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryAreaTest(){
        List<Area> areaList=areaDao.queryArea();
        for(int i=0;i<areaList.size();i++){
            System.out.println(areaList.get(i));
        }
    }
}
