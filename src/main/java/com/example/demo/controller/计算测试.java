package com.example.demo.controller;

import cn.hutool.core.convert.Convert;

import java.math.BigDecimal;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: 计算测试
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/12/2 16:35
 * @Version: 1.0
 */
public class 计算测试 {
    public static void main(String[] args) {
        String a="abcd-efg";
        String a1=a.substring(a.lastIndexOf("-")+1);
        String a2=a.substring(0,a.indexOf("-"));
        System.out.println(a1);//efg
        System.out.println(a2);//abcd
        String b="620303197010141212";
//        if(b.length() == 18){
//            String sex = b.substring(16, 17);
//            System.out.println(sex);
//            if(Integer.parseInt(sex)%2==0){
//                enfore_sex.setText("女");
//            }else{
//                enfore_sex.setText("男");
//            }
//        }

        String c="陕C38205(黄)色";
        String c1=c.substring(c.lastIndexOf(")")+1);
        String c2=c.substring(0,c.indexOf("("));
        String c3=c.replace("(","");
        c3=c3.replace(")","");
        String c5=c.substring(c.indexOf("(")+1,c.indexOf(")"));
        System.out.println(c1);//色
        System.out.println(c2);//陕C38205
        System.out.println(c3);//陕C38205黄色
        System.out.println(c5);//黄
    }
}
