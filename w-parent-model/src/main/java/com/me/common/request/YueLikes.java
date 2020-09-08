package com.me.common.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: w_parent->yueLikes
 * @description:
 * @author: szh
 * @create: 2020-07-24 20:06
 **/
@Data
public class YueLikes implements Serializable {
    private static final long serialVersionUID = 3278050219665418858L;

    private Integer id;


    private String content;


    private Date createTime;


    private Date greatTime;

}