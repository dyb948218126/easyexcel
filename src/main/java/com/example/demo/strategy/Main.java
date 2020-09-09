package com.example.demo.strategy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
//        int[] a = {9, 2, 6, 5, 8, 7, 3};
//        Sorter sorter = new Sorter();
//        sorter.sort(a);
//        System.out.println(Arrays.toString(a));

        /**
         * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
         *
         * 示例 1:
         *
         * 输入: "abcabcbb"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         */
        System.out.println(lengthOfLongestSubstring(
                "abccdefcgc"));

    }

    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            //获取当前字符对应的ascii码，因为每一个字符都会对应一个ascii码
            //例如 a 对应 97 b对应98
            int index = s.charAt(i);
            //从0开始，比如第一个字母是a 则表示0 和 last[97]下标的数字作比较，
            //由于一开始初始化了last数组每个下标的值为-1 所有-1+1 = 0 此时start = 0
            //假如第二次传入的还是a，last[97]此时的值为0 0+1 = 1 start 此时是0 所以 start是 = 1
            //加入第三次循环是b，last[98]的初始值为-1 start是1 ，last[98]+1 = 0 此时start = 1
            //加入第四次传入是c, last[99]的初始值为-1 start是1 last[99]+1 = 0 此时start = 1
            //假如第五次循环是a, last[97]此时的值为1 1+1 = 2 start参数为1 此时start = 2
            start = Math.max(start, last[index] + 1);
            //res初始值也为0，i此时为0 0-0+1 = 1 比res 大 此时res = 1
            //第二次循环 start = 1 res = 1,1-1+1 = 1 执行max方法后，此时res = 1
            //第三次循环 start = 1 res = 1,2-1+1 = 2 执行max方法后，此时res = 2
            //第四次循环 start = 1 res = 2,3-1+1 = 3 执行max方法后，此时res = 3
            //第五次循环 start = 2 res = 3,4-2+1 = 3 执行max方法后，此时res = 3
            res = Math.max(res, i - start + 1);
            //last[97]的值为0
            //第二次循环 last[97]的值为1
            //第三次循环 last[98]的值为2
            //第四次循环 last[99]的值为3
            //第五次循环 last[97]的值为4
            last[index] = i;
        }

        return res;
    }





    public static int lengthOfLongestSubstring1(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk +1 < n && !occ.contains(s.charAt(rk +1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk +1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i +1);
        }
        return ans;
    }

}
