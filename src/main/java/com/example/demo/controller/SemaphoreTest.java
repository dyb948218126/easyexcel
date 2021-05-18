package com.example.demo.controller;

import java.util.concurrent.Semaphore;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: SemaphoreTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/4/13 21:19
 * @Version: 1.0
 */
public class SemaphoreTest {
    private static Semaphore s1 = new Semaphore(1);
    private static Semaphore s2 = new Semaphore(1);
    private static Semaphore s3 = new Semaphore(1);

    public static void main(String[] args) {
        try {
            //这里先让线程s1和线程s2处于被占用状态
            s1.acquire();
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            while (true){
                try {
                    //拿到线程1的信号
                    s1.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("A");
                //释放线程2的信号量
                s2.release();
            }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    //拿到线程2的信号
                    s2.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B");
                //释放线程3的信号量
                s3.release();
            }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    //拿到线程3的信号
                    s3.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C");
                //释放线程1的信号量
                s1.release();
            }
        }).start();

    }
}
