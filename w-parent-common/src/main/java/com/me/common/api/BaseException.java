package com.me.common.api;

/**
 * @author : sizhenhui <p>
 * @date :  </p>
 * @time : 16:20 </p>
 */
public interface BaseException {
    int getCode();

    String getMessage();

    Object getError();
}
