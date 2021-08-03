package com.me.likes.controller;

import com.me.common.bo.ResponseBO;
import com.me.common.request.YueLikes;
import com.me.common.response.QueryLikesResp;
import com.me.likes.service.YueLikeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: w_parent->YueLikeController
 * @description: like控制层
 * @author: szh
 * @create: 2020-07-28 11:30
 **/
@Slf4j
@RestController
public class YueLikeController {

    @Autowired
    private YueLikeService yueLikeService;


    /**
     * @return
     * @Description:新增
     * @Param yueLikes
     * @Author: szh
     * @Date:
     **/
    @PostMapping(value = "/me/likes/save")
    public ResponseBO creatLikes(@RequestBody YueLikes yueLikes) {

        return yueLikeService.add(yueLikes);
    }

//
//    /**
//     * @return
//     * @Description:查询
//     * @Param queryLikesØØ
//     * @Author: szh
//     * @Date:
//     **/
//    @PostMapping(value = "me/like/query")
//    public ResponseBO<QueryLikesResp> query(QueryLikes queryLikes) {
//        return yueLikeService.get(queryLikes);
//    }
}