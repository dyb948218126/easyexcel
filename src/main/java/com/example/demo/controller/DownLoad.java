package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DownLoad {
    public List<Student> ExcelTest() {
        List<Student> list =new ArrayList<>();
        list.add(new Student("李磊0",12.123,545,new Date()));
        list.add(new Student("李磊1",12,545,new Date()));
        list.add(new Student("李磊2",12,545,new Date()));
        list.add(new Student("李磊3",12,545,new Date()));
        list.add(new Student("李磊4",12,545,new Date()));
        list.add(new Student("李磊5",12,545,new Date()));
        return list;
    }

    @GetMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode("测试","utf-8");
        response.setHeader("Content-disposition","attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), Student.class).sheet("模板").doWrite(ExcelTest());
    }
}
