package com.example.demo.controller;

import com.example.demo.Service.impl.FinanceCar;
import com.example.demo.entity.Car;
import com.example.demo.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: StringTest
 * @Author: Deng YuBin
 * @Description: test
 * @Date: 2020/10/16 11:45
 * @Version: 1.0
 */
public class StringTest {

    private static final ArrayList<Car> carList = new ArrayList<>();
    private static final ArrayList<FinanceCar> financeCarList = new ArrayList<>();

    static {
        carList.add(new Car("梅赛德斯-迈巴赫S级轿车",138,""));
        carList.add(new Car("梅赛德斯-AMG S 63 L 4MATIC+",230,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        carList.add(new Car("梅赛德斯-奔驰V级",50,""));
        financeCarList.add(new FinanceCar("梅赛德斯-迈巴赫S级轿车",138));
        financeCarList.add(new FinanceCar("梅赛德斯-AMG S 63 L 4MATIC+",230));
        financeCarList.add(new FinanceCar("梅赛德斯-奔驰V级",50));
    }

    public static void main(String[] args) {
        Map<String, Map<String, Long>> caseTypeMap = carList.stream().collect(groupingBy(a -> StringUtil.format("{0}{1}", a.getName(), a.getPrice()), groupingBy(Car::getName, counting())));

        for (String key : caseTypeMap.keySet()){
            Map<String, Long> stringLongMap = caseTypeMap.get(key);
            System.out.println(key+":"+caseTypeMap.get(key));
            for (String keyDtl : stringLongMap.keySet()){
                System.out.println(keyDtl+":"+stringLongMap.get(keyDtl));
            }

        }
    }
}
