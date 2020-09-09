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
        SoapClient client = SoapClient.create("http://180.166.220.23:8282/S_KJJK/SmartLink.asmx")
                // 设置要请求的方法，此接口方法前缀为web，传入对应的命名空间
                .setMethod("Insert_GeneralGoodsTransportFee", "http://smartlink.org/")
                // 设置参数，此处自动添加方法的前缀：web
                .setParam("datejson","{\"PHYSList\":[{\"Ticketnumber\":\"EX 20030395-4\",\"BoxType\":\"20GP\",\"LadingBillNo\":\"592413005\",\"CustomerName\":\"撬动\",\"PackingDate\":\"2020/4/7\",\"ShipName\":\"JPO PISCES\",\"VoyageNumber\":\"013S\",\"BoxNumber\":\"TCNU1906377\",\"Subject\":\"J上下车费\",\"TaxRate\":\"6\",\"Amount\":\"320\",\"InvoiceType\":\"增值税专用发票\",\"RecordDate\":\"2020/4/16 8:37:17\",\"PayObject\":\"付金矿\",\"AddTag\":\"0\",\"SectionTag\":\"1\",\"ExpenseType\":\"应收费用\",\"ExpenseAttribution\":\"码头费用支出\"},{\"Ticketnumber\":\"EX 20030395-4\",\"BoxType\":\"20GP\",\"LadingBillNo\":\"592413005\",\"CustomerName\":\"撬动\",\"PackingDate\":\"2020/4/7\",\"ShipName\":\"JPO PISCES\",\"VoyageNumber\":\"013S\",\"BoxNumber\":\"TCNU1906377\",\"Subject\":\"J上下车费\",\"TaxRate\":\"6\",\"Amount\":\"320\",\"InvoiceType\":\"增值税专用发票\",\"RecordDate\":\"2020/4/16 8:37:17\",\"PayObject\":\"付金矿\",\"AddTag\":\"0\",\"SectionTag\":\"1\",\"ExpenseType\":\"应收费用\",\"ExpenseAttribution\":\"码头费用支出\"}]}");

        // 发送请求，参数true表示返回一个格式化后的XML内容
        // 返回内容为XML字符串，可以配合XmlUtil解析这个响应
        String send = client.send(true);
        String nowSend = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>\n" +
                "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <soap:Body>\n" +
                "<su xmlns=\"http://smartlink.org/\"> \n"+
                "  <returnstatus>Success（成功）</returnstatus>  \n" +
                "  <message>ok</message>  \n" +
                "  <remainpoint>1490</remainpoint>  \n" +
                "  <taskID>885</taskID>  \n" +
                "  <successCounts>1</successCounts> \n" +
                "</su> \n"+
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        String testSend ="<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n \n" +
                "<return> \n"+
                "<su xmlns=\"http://smartlink.org/\"> \n"+
                "  <returnstatus>Success（成功）</returnstatus>  \n" +
                "  <message>ok</message>  \n" +
                "  <remainpoint>1490</remainpoint>  \n" +
                "  <taskID>885</taskID>  \n" +
                "  <successCounts>1</successCounts> \n" +
                "</su> \n"+
                "</return> \n"+
                "</soap:Envelope>";
        Console.log(send.toString());
        Console.log(testSend.toString());
        Document docResult= XmlUtil.readXML(send);
        //结果为“ok”
        Object value = XmlUtil.getByXPath("//soap:Envelope/soap:Body", docResult, XPathConstants.STRING);
        String result = Convert.toStr(value).trim();
        System.out.println(result.trim()+"*-----------");
        Console.log(result);
    }
}
