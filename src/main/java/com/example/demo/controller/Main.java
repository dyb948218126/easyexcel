package com.example.demo.controller;

import com.example.demo.entity.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        String s = null;
//        StringBuilder str = new StringBuilder();
//        System.out.println("请输入死掉的老鼠，死了输入1，活着输入0");
//        for (int i = 0; i < n; ++i) {
//            s = cin.next();
//            str.append(s);
//        }
//        cin.close();
//        String s1 = str.toString();
//        System.out.println("第" + Integer.valueOf(s1, 2) + "瓶水有毒");
//    }


    public static List<Student> ExcelTest() {
        List<Student> list =new ArrayList<>();
        list.add(new Student("李磊0",12.123,545,new Date()));
        list.add(new Student("李磊1",12,545,new Date()));
        list.add(new Student("李磊2",12,545,new Date()));
        list.add(new Student("李磊3",12,545,new Date()));
        list.add(new Student("李磊4",12,545,new Date()));
        list.add(new Student("李磊5",12,545,new Date()));
        return list;
    }

    /**
     * list根据某个字段分组
     * @param args
     */
    public static void main(String[] args) {
        List<Student> list = ExcelTest();
        Map<Double, List<Student>> collect = list.stream().collect(Collectors.groupingBy(student -> student.getAge()));
        collect.keySet().forEach(key-> System.out.println("map.get( "+key+" ) = "+collect.get(key)));
    }


}
