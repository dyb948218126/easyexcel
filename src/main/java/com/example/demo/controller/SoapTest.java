package com.example.demo.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.webservice.SoapClient;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathConstants;

/**
 * 对接webservice接口，并接受结果，解析xml文件结果内容
 *
 */
public class SoapTest {
    public static void main(String[] args) {
        // 新建客户端
        SoapClient client = SoapClient.create("http://180.166.220.23:8022/S_KJJK_ZS/SmartLink.asmx")
                // 设置要请求的方法，此接口方法前缀为web，传入对应的命名空间
                .setMethod("Insert_GeneralGoodsTransportFee", "http://smartlink.org/")
                // 设置参数，此处自动添加方法的前缀：web
                .setParam("datejson","{\"PHYSList\":[{\"AddTag\":0,\"BoxNumber\":\"\",\"BoxType\":\"40HC\",\"CustomerName\":\"现金客户\",\"ExpenseAttribution\":4,\n" +
                        "\"ExpenseType\":2,\"FeeId\":\"1298583834962460674\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"9498165491\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"王俊峰\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"AL NEFUD\",\"SubjectCode\":\"gg24港杂费\",\"Ticketnumber\":\"EX202008260006-1\",\"VoyageNumber\":\"013W\",\n" +
                        "\"addTag\":0,\"boxNumber\":\"\",\"boxType\":\"40HC\",\"customerName\":\"现金客户\",\"expenseAttribution\":4,\"expenseType\":2,\n" +
                        "\"feeId\":\"1298583834962460674\",\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"9498165491\",\"packingDate\":1598371200000,\n" +
                        "\"payObject\":\"王俊峰\",\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"AL NEFUD\",\"subjectCode\":\"gg24港杂费\",\n" +
                        "\"ticketnumber\":\"EX202008260006-1\",\"voyageNumber\":\"013W\"},{\"AddTag\":0,\"Amount\":\"0\",\"BoxNumber\":\"\",\"BoxType\":\"40GP\",\n" +
                        "\"CustomerName\":\"箱信\",\"FeeId\":\"1300330226965762049\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"4148715\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"COSCO SHIPPING CAPRICORN\",\"SubjectCode\":\"String\",\"Ticketnumber\":\"EX202008260005-2\",\"VoyageNumber\":\"011W\",\n" +
                        "\"addTag\":0,\"amount\":\"0\",\"boxNumber\":\"\",\"boxType\":\"40GP\",\"customerName\":\"箱信\",\"feeId\":\"1300330226965762049\",\n" +
                        "\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"4148715\",\"packingDate\":1598371200000,\"payObject\":\"\",\n" +
                        "\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"COSCO SHIPPING CAPRICORN\",\"subjectCode\":\"String\",\n" +
                        "\"ticketnumber\":\"EX202008260005-2\",\"voyageNumber\":\"011W\"},{\"AddTag\":0,\"Amount\":\"0\",\"BoxNumber\":\"\",\"BoxType\":\"45GP\",\n" +
                        "\"CustomerName\":\"箱信\",\"FeeId\":\"1298540311546343425\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"4148715\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"COSCO SHIPPING CAPRICORN\",\"SubjectCode\":\"string\",\"Ticketnumber\":\"EX202008260005-3\",\"VoyageNumber\":\"011W\",\n" +
                        "\"addTag\":0,\"amount\":\"0\",\"boxNumber\":\"\",\"boxType\":\"45GP\",\"customerName\":\"箱信\",\"feeId\":\"1298540311546343425\",\n" +
                        "\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"4148715\",\"packingDate\":1598371200000,\"payObject\":\"\",\n" +
                        "\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"COSCO SHIPPING CAPRICORN\",\"subjectCode\":\"string\",\n" +
                        "\"ticketnumber\":\"EX202008260005-3\",\"voyageNumber\":\"011W\"},{\"AddTag\":0,\"BoxNumber\":\"\",\"BoxType\":\"40GP\",\n" +
                        "\"CustomerName\":\"箱信\",\"FeeId\":\"1298540311441485826\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"4148715\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"COSCO SHIPPING CAPRICORN\",\"SubjectCode\":\"ex25T套用箱费\",\"Ticketnumber\":\"EX202008260005-1\",\n" +
                        "\"VoyageNumber\":\"011W\",\"addTag\":0,\"boxNumber\":\"\",\"boxType\":\"40GP\",\"customerName\":\"箱信\",\"feeId\":\"1298540311441485826\",\n" +
                        "\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"4148715\",\"packingDate\":1598371200000,\"payObject\":\"\",\n" +
                        "\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"COSCO SHIPPING CAPRICORN\",\"subjectCode\":\"ex25T套用箱费\",\n" +
                        "\"ticketnumber\":\"EX202008260005-1\",\"voyageNumber\":\"011W\"},{\"AddTag\":0,\"BoxNumber\":\"\",\"BoxType\":\"45GP\",\n" +
                        "\"CustomerName\":\"箱信\",\"FeeId\":\"1298540311546343425\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"4148715\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"COSCO SHIPPING CAPRICORN\",\"SubjectCode\":\"ex25T套用箱费\",\"Ticketnumber\":\"EX202008260005-3\",\n" +
                        "\"VoyageNumber\":\"011W\",\"addTag\":0,\"boxNumber\":\"\",\"boxType\":\"45GP\",\"customerName\":\"箱信\",\"feeId\":\"1298540311546343425\",\n" +
                        "\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"4148715\",\"packingDate\":1598371200000,\"payObject\":\"\",\n" +
                        "\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"COSCO SHIPPING CAPRICORN\",\"subjectCode\":\"ex25T套用箱费\",\n" +
                        "\"ticketnumber\":\"EX202008260005-3\",\"voyageNumber\":\"011W\"},{\"AddTag\":0,\"BoxNumber\":\"\",\"BoxType\":\"40GP\",\n" +
                        "\"CustomerName\":\"箱信\",\"FeeId\":\"1298540311588286465\",\"InvoiceType\":\"增值税发票\",\"LadingBilINo\":\"4148715\",\n" +
                        "\"PackingDate\":1598371200000,\"PayObject\":\"\",\"RecordDate\":\"2020-09-08 16:34:54\",\"SectionTag\":0,\n" +
                        "\"ShipName\":\"COSCO SHIPPING CAPRICORN\",\"SubjectCode\":\"ex25T套用箱费\",\"Ticketnumber\":\"EX202008260005-4\",\n" +
                        "\"VoyageNumber\":\"011W\",\"addTag\":0,\"boxNumber\":\"\",\"boxType\":\"40GP\",\"customerName\":\"箱信\",\"feeId\":\"1298540311588286465\",\n" +
                        "\"invoiceType\":\"增值税发票\",\"ladingBilINo\":\"4148715\",\"packingDate\":1598371200000,\"payObject\":\"\",\n" +
                        "\"recordDate\":\"2020-09-08 16:34:54\",\"sectionTag\":0,\"shipName\":\"COSCO SHIPPING CAPRICORN\",\"subjectCode\":\"ex25T套用箱费\",\n" +
                        "\"ticketnumber\":\"EX202008260005-4\",\"voyageNumber\":\"011W\"}]}");

        // 发送请求，参数true表示返回一个格式化后的XML内容
        // 返回内容为XML字符串，可以配合XmlUtil解析这个响应
        String send = client.send(true);

        Console.log(send.toString());
        Document docResult= XmlUtil.readXML(send);
        //结果为“ok”
        Object value = XmlUtil.getByXPath("//soap:Envelope", docResult, XPathConstants.STRING);
        String result = Convert.toStr(value).trim();
        System.out.println(result.trim()+"*-----------");
        Console.log(result);
    }
}
