package com.example.demo.controller;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: SingleDemo
 * @Author: Deng YuBin
 * @Description: 单例测试
 * @Date: 2021/4/11 21:58
 * @Version: 1.0
 */
public class SingleDemo {
    private static SingleDemo singleDemo;

    private SingleDemo() {
    }

    private static SingleDemo getInstance() {
        if (null == singleDemo) {
            synchronized (SingleDemo.class) {
                if (null == singleDemo) {
                    singleDemo = new SingleDemo();
                }

            }

        }
        return singleDemo;
    }
}
