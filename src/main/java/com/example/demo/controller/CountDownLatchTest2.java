package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: CountDownLatchTest2
 * @Author: Deng YuBin
 * @Description: 让多个线程等待，
 * @Date: 2021/3/31 13:57
 * @Version: 1.0
 */
public class CountDownLatchTest2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    //准备完毕……队友都蹲在草丛，等待号令
                    countDownLatch.await();
                    String parter = "【" + Thread.currentThread().getName() + "】";
                    System.out.println(parter + "开始执行……");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        Thread.sleep(2000);// 盖伦准备发令
        countDownLatch.countDown();// 盖伦发令：上去开团，冲鸭
    }
}
