package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: CountDownLatchTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/3/31 13:48
 * @Version: 1.0
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        System.out.println("(所有人)盖伦：准备中路开团…… ……");
        //第一个子线程执行
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        es1.execute(new Runnable() {
            @Override
            public void run()
            {
                try {
                    Thread.sleep(3000);
                    System.out.println("队友A："+Thread.currentThread().getName()+"来了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();
            }
        });
        es1.shutdown();

        //第二个子线程执行
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        es2.execute(new Runnable() {
            @Override
            public void run()
            {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("队友B："+Thread.currentThread().getName()+"来了");
                latch.countDown();
            }
        });
        es2.shutdown();
        System.out.println("等待两个队友到来…… ……");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("两个队友集合完毕，冲鸭");
    }
}
