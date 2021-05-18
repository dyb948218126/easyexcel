package com.example.demo.controller;

import cn.hutool.crypto.SecureUtil;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.concurrent.CountDownLatch;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: test
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/1/6 15:22
 * @Version: 1.0
 */
public class test {
    private static int x = 0, y = 0;
    private static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            x = 0;
            y = 0;
            a = 0;
            b = 0;
            CountDownLatch latch = new CountDownLatch(2);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                    latch.countDown();
                }

            });

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                    latch.countDown();
                }
            });

            thread.start();
            thread1.start();
            latch.await();
            String result = "第" + i + "次执行（" + x + "," + y + ")";
            if (x == 0 && y == 0){
                System.out.println(result);
                break;
            }
        }

    }
}
