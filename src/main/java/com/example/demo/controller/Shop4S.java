package com.example.demo.controller;

import com.example.demo.Service.CarService;
import com.example.demo.Service.impl.FinanceCar;
import com.example.demo.entity.Car;
import com.example.demo.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Shop4S {

    private static final ArrayList<Car> carList = new ArrayList<>();
    private static final ArrayList<FinanceCar> financeCarList = new ArrayList<>();

    static {
        carList.add(new Car("梅赛德斯-迈巴赫S级轿车",138,""));
        carList.add(new Car("梅赛德斯-AMG S 63 L 4MATIC+",230,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car(null,null,""));
        financeCarList.add(new FinanceCar("梅赛德斯-迈巴赫S级轿车",138));
        financeCarList.add(new FinanceCar("梅赛德斯-AMG S 63 L 4MATIC+",230));
        financeCarList.add(new FinanceCar("梅赛德斯-奔驰V级",50));
    }

    public static void main(String[] args) {
//        System.out.println("4s店销售记录");
//        for (Car car :carList){
//            System.out.println("车名: "+car.getName()+ "\t价格: "+car.getPrice()+"万元");
//        }
//
//        System.out.println("\n4s店售车记录（包含金融服务费）:");
//
//        for (FinanceCar car: financeCarList) {
//
//            System.out.println("车名：" + car.getName() + "\t价格：" + car.getPrice() + "万元");
//
//        }
//        for (Car car : carList) {
//            System.out.println(car);
//        }
//        carList.add(1,new Car("梅赛德斯-迈巴赫S级轿车",138));
//        carList.forEach(c ->{
//            System.out.println(c);
//        });

        Map<String, Map<String, Long>> collect = carList.stream().collect(groupingBy(car -> StringUtil.format("{0}#{1}", car.getName(), car.getPrice()), groupingBy(Car::getAddress, counting())));


        for (String key : collect.keySet()) {
            //箱量
            String[] split = key.split("#");
            String customerNameDb = split[0];
            String customerTaxRateName = split[1];

            System.out.println(customerNameDb+customerTaxRateName);
        }


    }
}
