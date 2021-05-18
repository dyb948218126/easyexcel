package com.example.demo.enumdemo;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.enumdemo
 * @ClassName: EnumTest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/12/16 20:10
 * @Version: 1.0
 */
public class EnumTest {

    public void judge(DemoEnum s){
        switch (s){
            case FAIL:
                System.out.println("秋天");
                break;
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }

    public static void main(String[] args) {
        for (DemoEnum s : DemoEnum.values()){
            System.out.println(s);
        }

        new EnumTest().judge(DemoEnum.SPRING);
    }
}
