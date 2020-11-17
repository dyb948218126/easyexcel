package com.example.demo.methoddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.methoddemo
 * @ClassName: ShortWheelBrake
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/10/21 0:00
 * @Version: 1.0
 */
public class ShortWheelBrake implements BrakeBehavior {
    @Override
    public void stop() {
        System.out.println("模拟短轮胎刹车痕迹！5");
    }
}
