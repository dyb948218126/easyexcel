package com.example.demo.entity;


/**
 * @ProjectName: pigxx-common
 * @Package: com.tilchina.zzw.awms.app.utils
 * @ClassName: Paging
 * @Author: Deng YuBin
 * @Description: 分页
 * @Date: 2020/11/17 13:41
 * @Version: 1.0
 */
public class Paging {

    //@ApiModelProperty(value="总条数")
    private Integer totalNum;//总条数
    //@ApiModelProperty(value="总页数")
    private Integer totalPage;//总页数
    //@ApiModelProperty(value="每页条数")
    private Integer pageSize;//每页条数
    //@ApiModelProperty(value="当前页码")
    private Integer pageIndex;//当前页码
    //@ApiModelProperty(value="当前页从第几条开始查")
    private Integer queryIndex;//当前页从第几条开始查

    public static Paging pagination(Integer totalNum,Integer pageSize,Integer pageIndex){
        Paging page = new Paging();
        page.setTotalNum(totalNum);
        Integer totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        page.setTotalPage(totalPage);
        page.setPageIndex(pageIndex + 1);
        page.setPageSize(pageSize);
        page.setQueryIndex(pageSize * pageIndex);
        return page;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getQueryIndex() {
        return queryIndex;
    }

    public void setQueryIndex(Integer queryIndex) {
        this.queryIndex = queryIndex;
    }
}
