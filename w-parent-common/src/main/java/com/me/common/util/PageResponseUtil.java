package com.me.common.util;


import com.me.common.annotations.Warning;
import com.me.common.api.ResponseStatus;
import com.me.common.bo.RequestPageBO;
import com.me.common.bo.ResponsePageBO;
import com.me.common.bo.ResponsePageVO;
import com.me.common.constant.HttpResponseStatus;
import com.me.likes.utils.constant.ClassUtil;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: w_parent->PageResponseUtil
 * @description:
 * @author: szh
 * @create: 2020-07-30 14:56
 **/
public final class PageResponseUtil {
    public PageResponseUtil() {
    }

    public static <T> ResponsePageBO<T> ok(RequestPageBO requestPageBO, Long totalSize, List<T> recordsList) {
        ResponsePageVO<T> responsePageVO = new ResponsePageVO(requestPageBO, totalSize, recordsList);
        ResponsePageBO<T> responsePageBO = new ResponsePageBO(true, responsePageVO, HttpResponseStatus.OK);
        return responsePageBO;
    }

    public static <T> ResponsePageBO<T> ok(RequestPageBO requestPageBO, Long totalSize, List<?> records, Class<T> respVoClass) {
        if (totalSize > 0L) {
            List<T> respVOList = (List)records.stream().map((entity) -> {
                T respVo = null;
                try {
                    respVo = ClassUtil.newInstance(respVoClass);
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                BeanUtils.copyProperties(entity, respVo);
                return respVo;
            }).collect(Collectors.toList());
            return ok(requestPageBO, totalSize, respVOList);
        } else {
            return ok(requestPageBO, totalSize, Collections.emptyList());
        }
    }

    @Warning("警告!!! 请不要在任何非只读事务内使用该方法")
    public static <T> ResponsePageBO<T> failed(RequestPageBO requestPageBO, ResponseStatus responseStatus) {
        ResponsePageVO<T> responsePageVO = new ResponsePageVO(requestPageBO);
        ResponsePageBO<T> responsePageBO = new ResponsePageBO(false, responsePageVO, responseStatus);
        return responsePageBO;
    }
}