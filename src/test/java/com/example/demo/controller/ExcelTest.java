package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.ExcelBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.example.demo.entity.ImageData;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentDto;
import org.apache.catalina.User;
import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ExcelTest {
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

    public List<StudentDto> ExcelTitelTest() {
        List<StudentDto> list =new ArrayList<>();
        list.add(new StudentDto("李磊0",12,545,new Date()));
        list.add(new StudentDto("李磊1",12,545,new Date()));
        list.add(new StudentDto("李磊2",12,545,new Date()));
        list.add(new StudentDto("李磊3",12,545,new Date()));
        list.add(new StudentDto("李磊4",12,545,new Date()));
        list.add(new StudentDto("李磊5",12,545,new Date()));
        return list;
    }

    /**
     * 简单写入方式一
     */
    @Test
    public void test(){
        String fileName = "学生表.xlsx";
        List<Student> list = ExcelTest();

        EasyExcel.write(fileName,Student.class).sheet("我是第一页").doWrite(list);
    }

    /**
     * 简单方式二
     */
    @Test
    public void test2(){
        String fileName = "学生表2.xlsx";
        List<Student> list = ExcelTest();

        //创建ExcelWriter对象
        ExcelWriter excelWriter = EasyExcel.write(fileName,Student.class).build();
        //创建sheet
        WriteSheet writeSheet = EasyExcel.write().sheet("我的学生表2").build();
        //合并对象
        excelWriter.write(list,writeSheet);

        excelWriter.finish();

    }

    /**
     * 去掉指定字段写入
     */
    @Test
    public void test3(){
        String fileName = "学生表3.xlsx";
        List<Student> list = ExcelTest();

        //要排除的字段存入set集合中，因为set集合不允许重复
        Set<String> set = new HashSet<>();
        set.add("number");
        set.add("creatTime");
        EasyExcel.write(fileName,Student.class).excludeColumnFiledNames(set).sheet("我是第一页").doWrite(list);
    }

    /**
     * 只写入指定的字段
     */
    @Test
    public void test4(){
        String fileName = "学生表4.xlsx";
        List<Student> list = ExcelTest();

        //要排除的字段存入set集合中，因为set集合不允许重复
        Set<String> set = new HashSet<>();
        set.add("number");
        set.add("creatTime");
        EasyExcel.write(fileName,Student.class).includeColumnFiledNames(set).sheet("我是第一页4").doWrite(list);
    }

    /**
     * 定义表头
     */
    @Test
    public void test5(){
        String fileName = "学生表5.xlsx";
        List<StudentDto> list = ExcelTitelTest();

        EasyExcel.write(fileName,Student.class).sheet("我是第一页").doWrite(list);
    }

    /**
     * 循环写入同一个sheet中
     */
    @Test
    public void test6(){
        String fileName = "学生表6.xlsx";
        List<Student> list = ExcelTest();


            //创建ExcelWriter对象
            ExcelWriter excelWriter = EasyExcel.write(fileName,Student.class).build();
            //创建sheet对象
            WriteSheet writeSheet = EasyExcel.writerSheet("我的sheet").build();
            //写
            //循环写入5次
        try {
            for (int i = 0; i <5 ; i++) {
                excelWriter.write(list,writeSheet);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            excelWriter.finish();
        }
    }

    /**
     * 循环写入不同sheet中
     */
    @Test
    public void test7(){
        String fileName = "学生表7.xlsx";
        List<Student> list = ExcelTest();


        //创建ExcelWriter对象
        ExcelWriter excelWriter = EasyExcel.write(fileName,Student.class).build();

        //写
        //循环写入5次
        try {
            for (int i = 0; i <5 ; i++) {
                //创建sheet对象
                WriteSheet writeSheet = EasyExcel.writerSheet("我的sheet"+ (i+1)).needHead(false).build();

                excelWriter.write(list,writeSheet);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            excelWriter.finish();
        }
    }

    @Test
    public void test12(){
        String fileName = "我的sheet.xlsx";
        List<Student> list = ExcelTest();

        ExcelWriter excelWriter = EasyExcel.write(fileName, Student.class).build();

        LinkedHashMap<String, List<Student>> map = new LinkedHashMap<>();
        map.put("第一",list);
        map.put("第二",list);
        map.put("第三",list);
        map.put("第四",list);
        map.put("第五",list);
        map.put("第六",list);
        map.put("第七",list);
        map.put("第八",list);
        map.put("第九",list);
        map.put("第十",list);
        try {
            Iterator<String> iter = map.keySet().iterator();
            while(iter.hasNext()) {
                String key = iter.next();
                List<Student> studentList = map.get(key);
                WriteSheet writeSheet = EasyExcel.writerSheet(key).build();
                excelWriter.write(studentList,writeSheet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            excelWriter.finish();
        }

    }

    /**
     * 格式化日期，数字
     */
    @Test
    public void test8(){
        String fileName = "学生表8.xlsx";
        List<Student> list = ExcelTest();

        EasyExcel.write(fileName,Student.class).sheet("我是第一页").doWrite(list);
    }

    /**
     * 格式化日期，数字
     */
    @Test
    public void test9() throws IOException {
        String fileName = "图片9.xlsx";
        List<ImageData> list = new ArrayList<>();
        ImageData imageData = new ImageData();

        //写入文件类型
        imageData.setFile(new File("231.jpg"));
        //字符串类型
        imageData.setString("231.jpg");
        //input流
        imageData.setInputStream(new FileInputStream(new File("231.jpg")));

        imageData.setUrl(new URL("http://t8.baidu.com/it/u=1484500186,1503043093&fm=79&app=86&f=JPEG?w=1280&h=853"));
        //字节
        byte[] bytes = new byte[(int) new File("231.jpg").length()];
        FileInputStream fileInputStream = new FileInputStream("231.jpg");
        fileInputStream.read(bytes,0,(int) new File("231.jpg").length());
        imageData.setByteArray(bytes);
        list.add(imageData);
        EasyExcel.write(fileName,ImageData.class).sheet("我是第一页").doWrite(list);
    }

    /**
     * 不创建对象的写
     */
    @Test
    public void noModelWrite(){
        //定义一个名称
        String fileName = "图片9"+System.currentTimeMillis()+".xlsx";

        EasyExcel.write(fileName).head(head()).sheet("模板").doWrite(dataList());
    }

    private List<List<String>> head() {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> head0 = new ArrayList<String>();
        head0.add("字符串" + System.currentTimeMillis());
        List<String> head1 = new ArrayList<String>();
        head1.add("数字" + System.currentTimeMillis());
        List<String> head2 = new ArrayList<String>();
        head2.add("日期" + System.currentTimeMillis());
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    private List<List<Object>> dataList() {
        List<List<Object>> list = new ArrayList<List<Object>>();
        for (int i = 0; i < 10; i++) {
            List<Object> data = new ArrayList<Object>();
            data.add("字符串" + i);
            data.add(new Date());
            data.add(0.56);
            list.add(data);
        }
        return list;
    }
}
