package com.example.demo.controller;

import com.example.demo.entity.Car;

/**
 * 单例模式
 */
public class Singleto {

    //new一个对象，且把该对象设为静态只读的
    private static final Singleto INSTANCE = new Singleto();

    //单例模式最关键的，把构造方法私有
    private Singleto() {};

    //外部调用这个方法完成new的操作
    public static Singleto getInstance() {return INSTANCE;}

    public static void main(String[] args) {
        Integer num = 8448656;
        String number = String.valueOf(num);
        int [] x = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            x[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        for (int i = 0; i < number.length(); i++) {
            System.out.println(x[i]+",");
        }
    }
}
