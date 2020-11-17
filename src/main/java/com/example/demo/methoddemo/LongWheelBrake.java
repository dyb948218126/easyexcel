package com.example.demo.methoddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.methoddemo
 * @ClassName: LongWheelBrake
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/10/20 23:59
 * @Version: 1.0
 */
public class LongWheelBrake implements BrakeBehavior {
    @Override
    public void stop() {
        System.out.println("模拟长轮胎刹车痕迹！10M");
    }
}
