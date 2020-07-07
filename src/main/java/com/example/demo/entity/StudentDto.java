package com.example.demo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto implements Serializable {
    @ExcelProperty({"学生信息表","名字"})
    private String name;
    @ExcelProperty({"学生信息表","年龄"})
    private int age;
    @ExcelProperty({"学生信息表","学号"})
    private Integer number;
    @ExcelProperty({"学生信息表","创建时间"})
    private Date creatTime;
}
