package com.me.likes.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.me.common.bo.ResponseBO;
import com.me.common.request.QueryLikes;
import com.me.common.request.YueLikes;
import com.me.common.response.QueryLikesResp;
import com.me.likes.repository.entity.YueLikeEntity;

/**
 * @author : sizhenhui <p>
 * @date :  </p>
 * @time : 11:33 </p>
 */
public interface YueLikeService extends IService<YueLikeEntity> {
    ResponseBO add(YueLikes yueLikes);

    ResponseBO<QueryLikesResp> get(QueryLikes queryLikes);
}
