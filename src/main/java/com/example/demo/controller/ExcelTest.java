package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.example.demo.entity.ImageData;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExcelTest {

    //    public static void main(String[] args) throws IOException {
//        //1.创建工作簿
//        Workbook wb = new HSSFWorkbook();
//
//        //2.创建sheet页
//        Sheet sheet = wb.createSheet();
//        //给sheet起个名字
//
//        //3.创建表格行
//        Row row = sheet.createRow(0);
//
//        //4.创建单元格
//        Cell cell = row.createCell(0);
//
//        //5.设置单元格对应的值
//        cell.setCellValue(65.5);
//
//        //6.设置单元格风格
//        CellStyle cellStyle = wb.createCellStyle();
//        cellStyle.setAlignment(HorizontalAlignment.CENTER);
//        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
//        //设置字体
//        Font font = wb.createFont();
//        font.setColor(Font.COLOR_RED);
//        cellStyle.setFont(font);
//        cell.setCellStyle(cellStyle);
//
//        //7.将数据写入单元格
//        FileOutputStream fileOutputStream = new FileOutputStream("D:/a.xlsx");
//        wb.write(fileOutputStream);
//    }
    public static void main(String[] args) throws IOException {
        String fileName = "图片9.xlsx";
        List<ImageData> list = new ArrayList<>();
        ImageData imageData = new ImageData();

        //写入文件类型
        imageData.setFile(new File("123.webp"));
        //字符串类型
        imageData.setString("123.webp");
        //input流
        imageData.setInputStream(new FileInputStream(new File("123.webp")));

        imageData.setUrl(new URL("http://t8.baidu.com/it/u=1484500186,1503043093&fm=79&app=86&f=JPEG?w=1280&h=853"));
        //字节
        byte[] bytes = new byte[(int) new File("123.webp").length()];
        FileInputStream fileInputStream = new FileInputStream("123.webp");
        fileInputStream.read(bytes,0,(int) new File("123.webp").length());
        imageData.setByteArray(bytes);
        list.add(imageData);
        EasyExcel.write(fileName,ImageData.class).sheet("我是第一页").doWrite(list);
    }

}
