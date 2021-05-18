package com.example.demo.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Car;
import com.sun.deploy.net.HttpUtils;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: TestController
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/11/24 15:04
 * @Version: 1.0
 */
public class TestController {


    public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
//        for (int i = 0; i < args.length; i++) {
//            if (i==2) System.out.println("执行你的逻辑");
//
//
//            System.out.println("执行你另外的逻辑");
//
//        }
//        Date date = DateUtil.date();
//        DateUtil.month(date);
//        System.out.println(DateUtil.month(date));


//        System.out.println(SecureUtil.rsa("123456"));

//        Date date = new Date();
//
////new方式创建
//        DateTime time = new DateTime(date);
//        Console.log(time);
//
////of方式创建
//        DateTime now = DateTime.now();
//        DateTime dt = DateTime.of(date);
//
//        Date parse = DateUtil.parse(DateUtil.formatDateTime(DateUtil.date()), "yyyy-MM-dd");
//
//        String folder = "";
//        String fileName = "123";
//        String key = folder + fileName;
//        System.out.println(key);

        TestController testController = new TestController();
        String token = testController.token();
        System.out.println(token);


    }


    public String token(){
        String URL_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxd0b49e275986e6c5&secret=a82b51b2d7acffcb93bc776278931cd5";

//        URL u = new URL(URL_TOKEN);
        String response = HttpUtil.get(URL_TOKEN);
        JSONObject jsonObject = JSONObject.parseObject(response);
        if (!StringUtils.isBlank(jsonObject.getString("access_token"))) {
            //log.info("获取token成功："+jsonObject.getString("access_token"));
            System.out.println(jsonObject.getString("access_token"));
            return "sdads";
        }
        return "asdda";
    }
}
