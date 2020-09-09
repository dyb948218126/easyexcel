package com.example.demo.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class JSExportVo implements Serializable {


    /**
     * 做箱日期
     */
//    @ExcelProperty(value = "锦浩共源（上海）供应链管理有限公司",index = 0)
//    private String  title;

    /**
     * 做箱日期
     */
    //@ApiModelProperty(value="做箱日期")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "日期"},index = 1)
    private String  doBoxTime;

    /**
     * 客户编号
     */
    //@ApiModelProperty(value="客户编号")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "客户编号"},index = 2)
    private String customerNum;

    /**
     * 客户名称
     */
    //@ApiModelProperty(value="客户名称")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "客户名称"},index = 3)
    private String customerName;

    /**
     * 船名
     */
    //@ApiModelProperty(value="船名")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "船名"},index = 4)
    private String vessle;
    /**
     * 航次
     */
    //@ApiModelProperty(value="航次")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "航次"},index = 5)
    private String voyage;

    /**
     * 提单号(进出口共用，出口为主提单号)
     */
    //@ApiModelProperty(value="提货单号")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "提货单号"})
    private String billNo;

//    /**
//     * 门点简称
//     */
//    //@ApiModelProperty(value="门点简称")
//    //@ExcelProperty("门点简称")
//    private String doorAbbr;

    /**
     * 箱型
     */
    //@ApiModelProperty(value="箱型")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "箱型箱量"})
    private String caseType;

//    /**
//     * 票号，进口：大写字母IM+日期年+月+日+四位流水号 + 箱序号，例：IM202004170001-1、IM202004170001-2；出口：大写字母EX+日期年+月+日+四位流水号 + 箱序号，例：EX202004170001-1、IM202004170001-2；
//     */
//    //@ApiModelProperty(value="票号，进口：大写字母IM+日期年+月+日+四位流水号 + 箱序号，例：IM202004170001-1、IM202004170001-2；出口：大写字母EX+日期年+月+日+四位流水号 + 箱序号，例：EX202004170001-1、IM202004170001-2；")
//    //@ExcelProperty("业务票号")
//    private String ticketNo;

    /**
     * 目的港(出口)
     */
    //@ApiModelProperty(value="目的港(出口)")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "靠港地"})
    private String destinationPort;

    /**
     * 费用
     */
//    //@ApiModelProperty(value="费用")
//    private Map<String, BigDecimal> orderFeeMap;

    /**
     * 费用
     */
    //@ApiModelProperty(value="费用")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "费用"})
    //private List<FeeMapDto> feeList;

    /**
     * 费用合计
     */
    //@ApiModelProperty(value = "合计")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "合计"})
    private BigDecimal accountFee;

    /**
     * 箱号
     */
    //@ApiModelProperty(value="箱号")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "箱号"})
    private String caseNo;

    /**
     * 装箱备注
     */
    //@ApiModelProperty(value="备注")
    //@ExcelProperty(value = {"锦浩共源（上海）供应链管理有限公司","业务结算清单", "备注"})
    private String packingRemark;

    public String getDoBoxTime() {
        return doBoxTime;
    }

    public void setDoBoxTime(String doBoxTime) {
        this.doBoxTime = doBoxTime;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getVessle() {
        return vessle;
    }

    public void setVessle(String vessle) {
        this.vessle = vessle;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

//    public List<FeeMapDto> getFeeList() {
//        return feeList;
//    }
//
//    public void setFeeList(List<FeeMapDto> feeList) {
//        this.feeList = feeList;
//    }

    public BigDecimal getAccountFee() {
        return accountFee;
    }

    public void setAccountFee(BigDecimal accountFee) {
        this.accountFee = accountFee;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getPackingRemark() {
        return packingRemark;
    }

    public void setPackingRemark(String packingRemark) {
        this.packingRemark = packingRemark;
    }
}
