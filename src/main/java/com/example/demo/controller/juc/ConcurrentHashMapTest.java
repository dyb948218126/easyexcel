package com.example.demo.controller.juc;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller.juc
 * @ClassName: ConcurrentHashMapTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/4/25 16:30
 * @Version: 1.0
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(1>>>4);
        int i = 1 >>> 4;
        System.out.println(i);
//        Map<String, Object> map = new ConcurrentHashMap<>();
//
//        for (int i = 0; i <30; i++) {
//            new Thread(()->{
//                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
//                System.out.println(map);
//            },String.valueOf(i)).start();
//        }

    }
}
