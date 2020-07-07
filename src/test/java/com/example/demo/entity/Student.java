package com.example.demo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @ExcelProperty("名字")
    private String name;
    @ExcelProperty("年龄")
    private double age;
    @ExcelProperty("学号")
    private Integer number;
    @ColumnWidth(50)
    @DateTimeFormat("yyyy年MM月dd日")
    @ExcelProperty("创建时间")
    private Date creatTime;
}
