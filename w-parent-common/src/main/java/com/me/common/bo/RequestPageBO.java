package com.me.common.bo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.StringJoiner;

/**
 * @program: w_parent->RequestPageBO
 * @description:
 * @author: szh
 * @create: 2020-07-30 14:53
 **/
public class RequestPageBO extends RequestBO {
    private static final long serialVersionUID = 3697188350855985629L;
    @NotNull(
            message = "分页参数页码不能为空~"
    )
    @Min(0L)
    @Max(2147483647L)
    protected Integer pageNum;
    @NotNull(
            message = "分页参数 页面容量展示条数 不能为空~"
    )
    @Min(0L)
    @Max(500L)
    protected Integer pageSize;

    public RequestPageBO() {
    }

    public String toString() {
        return (new StringJoiner(", ", RequestPageBO.class.getSimpleName() + "[", "]")).add("pageNum=" + this.pageNum).add("pageSize=" + this.pageSize).toString();
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageNum(final Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
    }
}