package com.example.demo.methoddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.methoddemo
 * @ClassName: ShortWheelCar
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/10/21 0:03
 * @Version: 1.0
 */
public class ShortWheelCar extends Car {
    public ShortWheelCar(BrakeBehavior brakeBehavior){
        brakeBehavior.stop();
    }
}
