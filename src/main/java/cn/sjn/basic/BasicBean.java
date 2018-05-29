package cn.sjn.basic;

/**
 * @ClassName: BasicBean
 * @Description: 基础bean
 * @Author: Jinni Shen
 * @Date: 10:35 2018/5/29
 * @Version: v1.0
 */
public class BasicBean {

    // 排序方式
    private String orderName;

    // 排序方式
    private String sortName;

    // 每页记录数
    private Integer limit;

    // 记录起始数
    private Integer offset;

    // 每页记录数
    private int pageSize;

    // 页码
    private int pageNumber;


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
