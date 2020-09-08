package com.me.common.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: w_parent->QueryLikesResp
 * @description:
 * @author: szh
 * @create: 2020-07-30 16:33
 **/
@Data
public class QueryLikesResp implements Serializable {
    private static final long serialVersionUID = -2377249461908559615L;

    private Integer id;

    private String content;

    private Date creatTime;

    private Date greatTime;



}