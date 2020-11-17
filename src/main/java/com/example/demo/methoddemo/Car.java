package com.example.demo.methoddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.methoddemo
 * @ClassName: Car
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/10/21 0:01
 * @Version: 1.0
 */
public abstract class Car {

    protected BrakeBehavior wheel;
    public void brake(){
        wheel.stop();
    }
}
