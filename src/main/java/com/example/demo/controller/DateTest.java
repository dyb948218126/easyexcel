package com.example.demo.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.webservice.SoapClient;
import cn.hutool.http.webservice.SoapUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.example.demo.entity.Car;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.*;

@Slf4j
public class DateTest {
    /**
     * 获取属性名数组
     */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    class test{
        int a = 3;

    }

    class test2{
        int b = 2;
    }

    public static void main(String[] args) throws ParseException {
//        String da = "2020-09-08T16:34:54";
//        Date xxx = new Date();
//        System.out.println(xxx);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        /**
         * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
         * */
//        Car c = new Car();
//        c.setName("dsa");
//        c.setPrice(120);
//        Object o = c;
//        Field[] fields = o.getClass().getDeclaredFields();
//        List list = new ArrayList();
//        Map infoMap;
//        for (int i = 0; i < fields.length; i++) {
//            infoMap = new HashMap();
//            infoMap.put("type", fields[i].getType().toString());
//            infoMap.put("name", fields[i].getName());
//            infoMap.put("value", getFieldValueByName(fields[i].getName(), o));
//            list.add(infoMap);
//        }
//        System.out.println(list.toString());

//        String dateStr1 = "2017-03-01 22:33:23";
//        Date date1 = DateUtil.parse(dateStr1);
//
//        String dateStr2 = "2017-04-20 23:33:23";
//        Date date2 = DateUtil.parse(dateStr2);
//
////相差一个月，31天
//        long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);
//
//        System.out.println(betweenDay);
//    }


        SoapClient client = SoapClient.create("http://180.166.220.23:8282/S_KJJK/SmartLink.asmx")
                // 设置要请求的方法，此接口方法前缀为web，传入对应的命名空间
                .setMethod("SELECT_GeneralGoodsTransportWorkFlowStatus", "http://smartlink.org/")
                .setParam("datejson", null);
        String send = client.send(true);
        //System.out.println(send);
        Document docResult = XmlUtil.readXML(send);
        //结果
        Object value = XmlUtil.getByXPath("//soap:Envelope", docResult, XPathConstants.STRING);
        //接收返回值
        String result = Convert.toStr(value).trim();

        System.out.println(result);




    }

}