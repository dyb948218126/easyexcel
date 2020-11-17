package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: pigxx-common
 * @Package: com.tilchina.zzw.gctms.tms.model.vo
 * @ClassName: CaseAcountOfDayVo
 * @Author: Deng YuBin
 * @Description: 每日箱量汇总数据库实体
 * @Date: 2020/10/16 9:25
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseAcountOfDayVo implements Serializable {

    /**
     * 做箱日期
     */
    private String doBoxTime;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户委托主体名称
     */
    private String customerTaxRateName;

    /**
     * 箱型
     */
    private String caseType;
}
