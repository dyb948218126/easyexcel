package com.example.demo.threaddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: StartDead
 * @Author: Deng YuBin
 * @Description: sa
 * @Date: 2020/10/14 22:15
 * @Version: 1.0
 */
public class StartDead extends Thread {

    private int i;

    public void run(){
        for (;i<100;i++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        StartDead startDead = new StartDead();
        for (int i = 0; i <300 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20){
                //启动线程
                startDead.start();

                //判断启动后线程的isAlive值，输出true
                System.out.println(startDead.isAlive());


            }

            //当线程处于新建、死亡两种状态时，isAlive() 方法返回false
            if (i>20 && !startDead.isAlive()){
                //试图再次启动该线程
                startDead.start();
            }

        }
    }
}
