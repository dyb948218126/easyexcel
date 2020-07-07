package com.example.demo.controller;

/**
 * 枚举单例
 * 不仅解决线程同步，还防止反序列化
 */
public enum  Singleto1 {

    INSTANCE;

    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() ->{
                System.out.println(Singleto1.INSTANCE.hashCode());
            }).start();
        }
    }
}
