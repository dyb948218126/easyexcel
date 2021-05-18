package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: MyQueue
 * @Author: Deng YuBin
 * @Description: 队列-实现
 * @Date: 2020/11/19 14:27
 * @Version: 1.0
 */
public class MyQueue {

    //数据
    private List<Integer> data;

    //指针
    private int p_start;

    public MyQueue(){
        data = new ArrayList<Integer>();

        p_start = 0;


    }

    public boolean enQueue(int x){
        data.add(x);
        return true;
    }

    public boolean deQueue(){
        if (isEmpty() == true){
            return false;
        }
        p_start++;
        return true;
    }

    public int Front(){
        return data.get(p_start);
    }

    public boolean isEmpty(){
        return p_start >=data.size();
    }


    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(8);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(0);
        q.enQueue(9);
        q.enQueue(12);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }

}
