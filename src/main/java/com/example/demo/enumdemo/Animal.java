package com.example.demo.enumdemo;

import org.omg.CORBA.Object;

import java.io.Serializable;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.enumdemo
 * @ClassName: Animal
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/12/16 20:42
 * @Version: 1.0
 */
public abstract class Animal {

    abstract String update(String name);

    abstract String get(String name);


    void insert(){

    }

    void delete(){

    }
    static class Dog extends Animal{

        @Override
        String update(String name) {
            return name;
        }

        @Override
        String get(String name) {
            return name;
        }
    }

    public static class Example{
        public static void main(String[] args) {
            Dog dog = new Dog();
            System.out.println(dog.get("我是查看"));
            System.out.println(dog.update("我是修改"));
        }
    }
}
