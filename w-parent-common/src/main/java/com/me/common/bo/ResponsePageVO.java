package com.me.common.bo;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @program: w_parent->ResponsePageVO
 * @description:
 * @author: szh
 * @create: 2020-07-30 14:53
 **/
public final class ResponsePageVO <T> implements Serializable {
    private static final long serialVersionUID = -2254156511709794827L;
    private Long totalSize;
    private List<T> list;
    private Object condition;

    public ResponsePageVO() {
    }

    public ResponsePageVO(RequestPageBO condition) {
        this.totalSize = 0L;
        this.condition = condition;
        this.list = Collections.emptyList();
    }

    public ResponsePageVO(RequestPageBO condition, Long totalSize, List<T> recordList) {
        this.totalSize = totalSize;
        this.condition = condition;
        this.list = recordList;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

    public List<T> getList() {
        return this.list;
    }

    public Object getCondition() {
        return this.condition;
    }

    public void setTotalSize(final Long totalSize) {
        this.totalSize = totalSize;
    }

    public void setList(final List<T> list) {
        this.list = list;
    }

    public void setCondition(final Object condition) {
        this.condition = condition;
    }
}