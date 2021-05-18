package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: CountDownLatchDemo
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/4/12 21:18
 * @Version: 1.0
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        int size =3;
        CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < size; i++) {
            new Thread(() -> {
                try {
                    latch.await();
                    System.out.println("线程"+Thread.currentThread().getName()+"执行时间"+System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        latch.countDown();
    }
}
