package com.me.common.util;

import com.me.common.api.ResponseStatus;
import com.me.common.constant.HttpResponseStatus;
import com.me.common.exception.BusinessException;
import com.me.common.bo.ResponseBO;


/**
 * @program: w_parent->ResponseUtil
 * @description: 同一返回
 * @author: szh
 * @create: 2020-07-24 17:34
 **/

public final class ResponseUtil<T>{

    public ResponseUtil() {
    }

    public static <T> ResponseBO<T> ok() {
        return (ResponseBO<T>) ok((Object)null, HttpResponseStatus.OK.getCode(), HttpResponseStatus.OK.getMessage());
    }

    /** @deprecated */
    @Deprecated
    public static <T> ResponseBO<T> ok(final ResponseStatus responseStatus) {
        return (ResponseBO<T>) ok((Object)null, responseStatus.getCode(), responseStatus.getMessage());
    }

    /** @deprecated */
    @Deprecated
    public static <T> ResponseBO<T> ok(final String message) {
        return (ResponseBO<T>) ok((Object)null, HttpResponseStatus.OK.getCode(), message);
    }

    public static <T> ResponseBO<T> ok(final T data, final String message) {
        return ok(data, HttpResponseStatus.OK.getCode(), message);
    }

    public static <T> ResponseBO<T> ok(final T data) {
        return ok(data, HttpResponseStatus.OK.getCode(), HttpResponseStatus.OK.getMessage());
    }

    /** @deprecated */
    @Deprecated
    public static <T> ResponseBO<T> ok(final T data, final ResponseStatus responseStatus) {
        return ok(data, responseStatus.getCode(), responseStatus.getMessage());
    }

    /** @deprecated */
    @Deprecated
    public static <T> ResponseBO<T> ok(final T data, final Integer code, final String message) {
        return new ResponseBO(true, data, code, message, (Object)null);
    }

    /** @deprecated */
    public static <T> ResponseBO<T> failed() {
        throw new BusinessException(HttpResponseStatus.INTERNAL_SERVER_ERROR.getCode(), HttpResponseStatus.INTERNAL_SERVER_ERROR.getMessage());
    }

    public static <T> ResponseBO<T> failed(final Integer code, final String message, Object error) {
        throw new BusinessException(code, message, error);
    }

    public static <T> ResponseBO<T> failed(final Integer code, final String message) {
        throw new BusinessException(code, message);
    }

    public static <T> ResponseBO<T> failed(final ResponseStatus responseStatus) {
        throw new BusinessException(responseStatus.getCode(), responseStatus.getMessage());
    }

    public static <T> ResponseBO<T> failed(final ResponseStatus responseStatus, Object error) {
        throw new BusinessException(responseStatus.getCode(), responseStatus.getMessage(), error);
    }
}