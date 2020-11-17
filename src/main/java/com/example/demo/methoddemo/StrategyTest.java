package com.example.demo.methoddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.methoddemo
 * @ClassName: StrategyTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/10/21 0:08
 * @Version: 1.0
 */
public class StrategyTest {
    public static void main(String[] args) {
        BrakeBehavior brake = new LongWheelBrake();
        ShortWheelCar car = new ShortWheelCar(brake);
        car.brake();

    }
}
