package com.me.common.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.me.common.api.Response;
import com.me.common.api.ResponseStatus;
import com.me.common.constant.HttpResponseStatus;

import java.util.StringJoiner;

/**
 * @program: w_parent->ResponseBO
 * @description:
 * @author: szh
 * @create: 2020-07-28 16:03
 **/
public class ResponseBO<T> implements Response {
    private static final long serialVersionUID = -1248839244063189043L;
    private Boolean success;
    private T data;
    private Integer code;
    private String message;
    private Object error;

    public ResponseBO() {
        this.success = false;
        this.code = HttpResponseStatus.INTERNAL_SERVER_ERROR.getCode();
        this.message = HttpResponseStatus.INTERNAL_SERVER_ERROR.getMessage();
    }

    public ResponseBO(Integer code, String message) {
        this.success = false;
        this.code = code;
        this.message = message;
    }

    public ResponseBO(Integer code, String message, Object error) {
        this.success = false;
        this.code = code;
        this.message = message;
        this.error = error;
    }

    public ResponseBO(ResponseStatus responseStatus) {
        this.success = false;
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

    public ResponseBO(ResponseStatus responseStatus, Object error) {
        this.success = false;
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
        this.error = error;
    }

    public ResponseBO(final T data) {
        this.success = true;
        this.code = HttpResponseStatus.OK.getCode();
        this.message = HttpResponseStatus.OK.getMessage();
    }

    public ResponseBO(final Boolean success, final T data, ResponseStatus responseStatus) {
        this.success = success;
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

    public ResponseBO(final Boolean success, final T data, final Integer code, final String message) {
        this.success = success;
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public ResponseBO(final Boolean success, final T data, final Integer code, final String message, Object error) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
        this.error = error;
    }

    @JsonIgnore
    @JSONField(
            serialize = false
    )
    public boolean isFailed() {
        return !this.success;
    }

    public String toString() {
        return (new StringJoiner(", ", ResponseBO.class.getSimpleName() + "[", "]")).add("success=" + this.success).add("data=" + this.data).add("code=" + this.code).add("message='" + this.message + "'").add("error=" + this.error).toString();
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public T getData() {
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

    public void setData(final T data) {
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