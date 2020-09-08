package com.me.likes.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.me.common.bo.ResponseBO;
import com.me.common.request.QueryLikes;
import com.me.common.request.YueLikes;
import com.me.common.response.QueryLikesResp;
import com.me.common.util.ResponseUtil;
import com.me.likes.repository.entity.YueLikeEntity;
import com.me.likes.repository.mapper.YueLikeMapper;
import com.me.likes.service.YueLikeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: w_parent->YueLikeServiceImpl
 * @description:
 * @author: szh
 * @create: 2020-07-28 11:34
 **/
@Service("yueLikeService")
public class YueLikeServiceImpl extends ServiceImpl<YueLikeMapper, YueLikeEntity> implements YueLikeService {

    @Resource
    private YueLikeMapper yueLikeMapper;

    @Override
    public ResponseBO add(YueLikes yueLikes) {
        YueLikeEntity entity = new YueLikeEntity();
        BeanUtils.copyProperties(yueLikes, entity);
        yueLikeMapper.insert(entity);
        return ResponseUtil.ok();
    }

    @Override
    public ResponseBO<QueryLikesResp> get(QueryLikes queryLikes) {
        YueLikeEntity yueLikesEntity = yueLikeMapper.selectById(queryLikes.getId());
        QueryLikesResp queryLikesResp = new QueryLikesResp();
        BeanUtils.copyProperties(yueLikesEntity, queryLikesResp);
        return ResponseUtil.ok(queryLikesResp);
    }
}