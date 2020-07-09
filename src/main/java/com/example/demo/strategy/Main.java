package com.example.demo.strategy;

import java.util.Arrays;
import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        int[] a = {9, 2, 6, 5, 8, 7, 3};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));


    }
}
