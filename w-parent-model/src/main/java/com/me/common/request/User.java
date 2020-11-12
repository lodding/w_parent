package com.me.common.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: test-poi->User
 * @description:
 * @author: Alan
 * @create: 2020-10-13 10:29
 **/

@Data
public class User implements Serializable {

    private String id;
    private String name;
    private String password;
    private String address;
    private String phoneNum;
    private String likeNum;
}

