package com.example.demo.threaddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: InvokeRun
 * @Author: Deng YuBin
 * @Description: 多线程测试类
 * @Date: 2020/10/14 22:06
 * @Version: 1.0
 */
public class InvokeRun extends Thread {

    private int i;

    public void run(){
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getContextClassLoader());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i == 20){
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
