package com.example.demo.threaddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: JoinThread
 * @Author: Deng YuBin
 * @Description: 控制线程-join线程
 * @Date: 2020/10/14 22:23
 * @Version: 1.0
 */
public class JoinThread extends Thread {

    public JoinThread(String name)
    {
        super(name);

    }

    //重写run()方法 定义线程执行体
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动子线程
        new JoinThread("新线程").start();
        for (int i = 0; i < 100; i++) {
            if (i == 20){
                //
                JoinThread joinThread = new JoinThread("被join的线程");
                joinThread.start();
                //main线程调用了joinThread线程的join方法，main线程必须等
                //joinThread执行结束，才会向下执行
                joinThread.join();


            }
            System.out.println(Thread.currentThread().getName() + " "+ i);

        }
    }
}
