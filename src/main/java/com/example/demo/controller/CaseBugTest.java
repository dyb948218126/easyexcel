package com.example.demo.controller;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.example.demo.entity.CaseAcountOfDayVo;
import com.example.demo.utils.StringUtil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: CaseBugTest
 * @Author: Deng YuBin
 * @Description: 测试项目bug
 * @Date: 2020/10/22 9:57
 * @Version: 1.0
 */
public class CaseBugTest {

    public static void main(String[] args) {
        List<CaseAcountOfDayVo> caseAcountOfDayVoList = new ArrayList<>();
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港",null,"2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));
        caseAcountOfDayVoList.add(new CaseAcountOfDayVo("带箱进港","","2020-09-01","40GP"));





        JSONArray jsonArray = new JSONArray();

        if (CollectionUtil.isNotEmpty(caseAcountOfDayVoList)) {
            //根据客户名称，委托主体，做箱日期分组
            //key是以上三者拼接成的字符串
            Map<String, Map<String, Long>> caseTypeMap = caseAcountOfDayVoList
                    .stream()
                    .collect(groupingBy(caseAcountOfDayVo ->
                            StringUtil.format("{0}#{1}", caseAcountOfDayVo.getCustomerName(),
                                    caseAcountOfDayVo.getCustomerTaxRateName()), groupingBy(CaseAcountOfDayVo::getDoBoxTime, counting())));

            for (String key : caseTypeMap.keySet()) {
                //箱量
                JSONObject caseAcountObj = new JSONObject();
                String[] split = key.split("#");
                String customerNameDb = split[0];
                String customerTaxRateName = split[1];
                if (StrUtil.isNotBlank(customerNameDb) && !"null".equals(customerNameDb)) {
                    caseAcountObj.put("customerNme", customerNameDb);
                } else {
                    caseAcountObj.put("customerNme", null);
                }

                if (StrUtil.isNotBlank(customerTaxRateName) && !"null".equals(customerTaxRateName)) {
                    caseAcountObj.put("customerTaxRateName", customerTaxRateName);
                } else {
                    caseAcountObj.put("customerTaxRateName", null);
                }


                //分好组的每个vlue
                Map<String, Long> stringLongMap = caseTypeMap.get(key);
                for (String keyDtl : stringLongMap.keySet()) {
                    //截取到日
                    String doBoxTimes = keyDtl.substring(keyDtl.length() - 2, keyDtl.length());
                    String day = "";
                    if ("0".equals(doBoxTimes.substring(0, 1))) {
                        day = doBoxTimes.substring(doBoxTimes.length() - 1) + "day";
                    } else {
                        day = doBoxTimes + "day";
                    }
                    //每天对应的箱量
                    caseAcountObj.put(day, stringLongMap.get(keyDtl));
                }
                jsonArray.add(caseAcountObj);
            }

        }

        jsonArray.forEach(js ->{
            System.out.println(js);
        });




































    }

}
