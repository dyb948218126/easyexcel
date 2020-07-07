package com.example.demo.Service.impl;

import com.example.demo.Service.CarService;

public class CarServiceImpl implements CarService {
    // 车名

    private String name;

    // 车价格

    private int price;



    // 通过构造方法实例化
    public CarServiceImpl(String _name, int _price) {

        this.name = _name;

        this.price = _price;

    }



    // 获取车名

    @Override
    public String getName() {

        return this.name;

    }

    // 获取车价格

    @Override
    public int getPrice() {

        return this.price;

    }
}
