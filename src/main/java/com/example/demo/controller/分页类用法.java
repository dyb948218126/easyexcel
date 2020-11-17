package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.entity.Paging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: 分页类用法
 * @Author: Deng YuBin
 * @Description: 分页类用法
 * @Date: 2020/11/17 14:25
 * @Version: 1.0
 */
public class 分页类用法 {

    /**
     * 用法
     *
     * @param pageSize 每页总条数
     * @param pageIndex 当前页
     * @return
     */
    public List<Car> getPage(Integer pageSize,Integer pageIndex){
        List<Car> carList = new ArrayList<>();
        Paging paging = Paging.pagination(carList.size(),pageSize,pageIndex);
        int fromIndex = paging.getQueryIndex();
        int toIndex = 0;
        if (fromIndex + paging.getPageSize() >= carList.size()){
            toIndex = carList.size();
        }else {
            toIndex = fromIndex +  paging.getPageSize();
        }
        if (fromIndex > toIndex){
            return Collections.EMPTY_LIST;
        }
        return carList.subList(fromIndex,toIndex);
    }



}
