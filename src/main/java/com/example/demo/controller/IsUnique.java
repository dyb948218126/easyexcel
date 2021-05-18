package com.example.demo.controller;

import cn.hutool.core.lang.tree.TreeNode;
import com.example.demo.utils.StringUtil;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: IsUnique
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/4/21 14:43
 * @Version: 1.0
 */
public class IsUnique {
    public static void main(String[] args) {
//        String s= "ACb-A sd  sddda ";
//        String s2 = "Cb-AA";
//        int length = 10;
        IsUnique isUnique = new IsUnique();
//        String uniqueTest = isUnique.isUniqueTest(s, length);
//        System.out.println(uniqueTest);
        int[] num1 = new int[]{1,3},num2 = new int[]{2};
        double medianSortedArrays = isUnique.findMedianSortedArrays(num1, num2);
        System.out.println(medianSortedArrays);
    }

    private String isUniqueTest(String s1, int length){
        char[] chars = s1.toCharArray();
        int le = length - 1;
        int sLe = s1.length() - 1;
        while (le>=0){
            if (chars[le] == ' '){
                chars[sLe--] = '0';
                chars[sLe--] = '2';
                chars[sLe--] = '%';
            }else {
                chars[sLe--] = chars[le];
            }
            le --;
        }
        return String.valueOf(chars,sLe + 1,s1.length() - sLe - 1);

//        char[] chars = aStr.toCharArray();
//        for (int i = 0; i < chars.length - 1; i++) {
//            char aChar = chars[i];
//            for (int i1 = i; i1 < chars.length -1; i1++) {
//                if (aChar == chars[i1+1]){
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    private double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;
            if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
                right = A[aStart++];
            } else {
                right = B[bStart++];
            }
        }
        if ((len & 1) == 0)
            return (left + right) / 2.0;
        else
            return right;
    }

    private int testTree(TreeNode node){
        return 0;
    }

}
