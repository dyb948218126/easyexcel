package com.example.demo.enumdemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.enumdemo
 * @ClassName: GenDerTest
 * @Author: Deng YuBin
 * @Description: 枚举类的成员变量----demo使用
 * @Date: 2020/12/16 20:19
 * @Version: 1.0
 */
public class GenDerTest {
    public static void main(String[] args) {
        GenDer g = Enum.valueOf(GenDer.class, "我是G");

        g.user = "怒";
        g.pwd = "火";
        System.out.println(g);
        System.out.println(g.user);
        System.out.println(g.pwd);
    }
}
