package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= 35; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {
            list2.add(i);
        }
        Random rd = new Random();
        String out = "普通";
        for (int i = 0; i < 5; i++) {
            int nextInt = rd.nextInt(list1.size());
            out += String.valueOf(list1.get(nextInt)) + "-";
            list1.remove(nextInt);
        }
        out += "特殊";
        for (int i = 0; i < 2; i++) {
            int nextInt = rd.nextInt(list2.size());
            out += String.valueOf(list2.get(nextInt)) + "-";
            list2.remove(nextInt);
        }
        System.out.println(out);
    }
}
