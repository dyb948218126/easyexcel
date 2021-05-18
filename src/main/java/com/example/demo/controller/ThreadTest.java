package com.example.demo.controller;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: ThreadTest
 * @Author: Deng YuBin
 * @Description: Volatile的作用
 * @Date: 2021/4/11 21:48
 * @Version: 1.0
 */
public class ThreadTest {

    private static /*volatile*/ boolean flag = true;

    public static void main(String[] args) {

        new Thread(()->{
            while (flag){

            }
            System.out.println("----------------END of Thread--------------");
        }).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("true flag off");
        flag = false;

    }
}
