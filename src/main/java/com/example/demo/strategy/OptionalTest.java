package com.example.demo.strategy;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {


        //1.empty 方法
        Optional<String> optional = Optional.empty();

        //会抛出NoSuchElementException
        //System.out.println(optional.get());

        //2.of 方法  & get 方法
        optional = Optional.of("我有值了，哈哈哈哈、");
        System.out.println("2 ---> " + optional.get());

        //3. isPresent 方法
        if (optional.isPresent()) {
            System.out.println("3 ---> " + optional.get());
        }

        //4. ifPresent,测试案例3中这种判断方式和
        // 现有的先判断是否为null，再处理是一致的，更好的一种方式是使用ifPresent
        optional.ifPresent(item -> System.out.println("4 ---> " + item));
        //optional = Optional.empty();

        //optional.ifPresent(item -> System.out.println("4 ---> " + item));

        //5.filter 方法
        optional = Optional.of("案例5-乾坤大挪移").filter(item -> "案例".equals(item));
        System.out.println("5 --->" + optional.isPresent());
        optional = Optional.of("案例5-妙手回春").filter(item -> "案例5-妙手回春".equals(item));
        System.out.println("5 --->" + optional.isPresent() +", value:" +optional.get());


    }
}
