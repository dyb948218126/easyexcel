package com.example.demo.controller;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: VolatileTest
 * @Author: Deng YuBin
 * @Description: 多个线程依次执行
 * @Date: 2021/4/12 21:08
 * @Version: 1.0
 */
public class VolatileTest {

    private static volatile int state = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (state == 1) {
                    try {
                        Thread.sleep(100);

                        for (int i = 1; i < 10; i++) {
                            System.out.println("a" + i);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    state = 2;
                    return;
                }
            }

        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (state == 2) {
                    try {
                        Thread.sleep(100);

                        for (int i = 1; i < 10; i++) {
                            System.out.println("b" + i);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    state = 3;
                    return;
                }
            }

        });

        Thread thread3 = new Thread(() -> {
            while (true) {
                if (state == 3) {
                    try {
                        Thread.sleep(100);
                        for (int i = 1; i < 10; i++) {
                            System.out.println("c" + i);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return;
                }
            }

        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
