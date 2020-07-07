package com.example.demo.Service.impl;

import com.example.demo.Service.CarService;

public class FinanceCar extends CarServiceImpl {

    public FinanceCar(String _name, int _price) {
        super(_name, _price);
    }

    // 覆写价格信息

    @Override

    public int getPrice() {

        // 获取原价

        int selfPrice = super.getPrice();

        int financePrice = 0;

        if (selfPrice >= 100) {

            financePrice = selfPrice + selfPrice * 5 / 100; // 收取5%的金融服务费

        } else if (selfPrice >= 50) {

            financePrice = selfPrice + selfPrice * 2 / 100; // 收取2%的金融服务费

        } else {

            financePrice = selfPrice; // 其余不收取服务费

        }

        return financePrice;

    }
}
