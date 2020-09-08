package com.me.common.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.me.common.api.Response;
import com.me.common.api.ResponseStatus;
import com.me.common.constant.HttpResponseStatus;

/**
 * @program: w_parent->ResponsePageBO
 * @description:
 * @author: szh
 * @create: 2020-07-30 14:50
 **/
public final class ResponsePageBO <T> implements Response {

    private static final long serialVersionUID = -6227611767220392892L;
    private Boolean success;
    private ResponsePageVO<T> data;
    private Integer code;
    private String message;
    private Object error;

    public ResponsePageBO() {
        this.success = false;
        this.code = HttpResponseStatus.INTERNAL_SERVER_ERROR.getCode();
        this.message = HttpResponseStatus.INTERNAL_SERVER_ERROR.getMessage();
    }

    public ResponsePageBO(Integer code, String message) {
        this.success = false;
        this.code = code;
        this.message = message;
    }

    public ResponsePageBO(final Boolean success, ResponseStatus responseStatus) {
        this.success = success;
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

    public ResponsePageBO(final Boolean success, final ResponsePageVO<T> data, ResponseStatus responseStatus) {
        this.success = success;
        this.data = data;
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

    @JsonIgnore
    @JSONField(
            serialize = false
    )
    public boolean isFailed() {
        return !this.success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public ResponsePageVO<T> getData() {
        return this.data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getError() {
        return this.error;
    }

    public void setSuccess(final Boolean success) {
        this.success = success;
    }

    public void setData(final ResponsePageVO<T> data) {
        this.data = data;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setError(final Object error) {
        this.error = error;
    }
}