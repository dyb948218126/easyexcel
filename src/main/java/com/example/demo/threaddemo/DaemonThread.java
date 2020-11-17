package com.example.demo.threaddemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.threaddemo
 * @ClassName: DaemonThread
 * @Author: Deng YuBin
 * @Description: 控制线程2-后台线程，又称守护线程，JVM的垃圾回收线程就是典型的后台线程
 * 后台线程的最大特征是： 如果所有的前台线程都死亡，后台线程会自动死亡
 * @Date: 2020/10/14 22:41
 * @Version: 1.0
 */
public class DaemonThread extends Thread {

    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println(getName() + "run()----" +i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        //将此线程设置成后台线程
        t.setDaemon(true);
        //启动后台线程
        t.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "main() " +i);
        }
        //---------程序执行到此处，前台线程结束--------
        //后台线程也应该随之结束
    }
}
