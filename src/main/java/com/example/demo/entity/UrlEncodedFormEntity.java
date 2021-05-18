package com.example.demo.entity;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.entity
 * @ClassName: UrlEncodedFormEntity
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/12/18 9:18
 * @Version: 1.0
 */
public class UrlEncodedFormEntity {
    public static List<List<?>> test(List<List<?>> rows) {
        for (int i = 0; i<=100000; i++){
            List<?> row1 = CollUtil.newArrayList("aa", "bb", "cc", "dd", DateUtil.date(), 3.22676575765);
            rows.add(row1);
        }
        return rows;


    }

    public static void main(String[] args) {
        List<List<?>> rows = new ArrayList<>();
        test(rows);
        BigExcelWriter writer= ExcelUtil.getBigWriter("d:/xxx.xlsx");
// 一次性写出内容，使用默认样式
        writer.write(rows);
// 关闭writer，释放内存
        writer.close();
    }
}
