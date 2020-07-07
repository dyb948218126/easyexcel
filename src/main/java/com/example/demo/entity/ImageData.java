package com.example.demo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.converters.string.StringImageConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageData implements Serializable {

    //使用抽象文件保存一个图片
    private File file;
    //使用输入流保存一个图片
    private InputStream inputStream;

    //当使用一个String类型保存一张图片时需要StringImageConverter转换器
    @ExcelProperty(converter = StringImageConverter.class)
    private String string;

    //使用二进制数据保存一个图片
    private byte[] byteArray;

    //使用网络连接保存一个图片
    private URL url;
}
