package com.example.demo.controller;

import org.springframework.cache.annotation.CachePut;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: DesTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/1/7 9:24
 * @Version: 1.0
 */
public class DesTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("40");
        list.add("40");
        list.add("50");
        list.add("40");
        list.add("40");
        list.add("50");
        list.add("40");
        list.add("70");
        list.add("40");
        list.add("60");
        list.add("40");
        list.add("60");
        list.add("70");

        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();
        list.forEach(type -> objectObjectHashMap.merge(type, 1, Integer::sum));
        for (String entity : objectObjectHashMap.keySet()){
            System.out.println(entity+":"+objectObjectHashMap.get(entity)+"个");
        };
    }
}
