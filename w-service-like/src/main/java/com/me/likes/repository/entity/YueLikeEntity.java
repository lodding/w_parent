package com.me.likes.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.me.common.bo.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @program: w_parent->YueLikeEntity
 * @description:
 * @author: szh
 * @create: 2020-08-27 21:33
 **/
@Data
@Accessors(chain = true)
@TableName("xiao_yue_like")
@AllArgsConstructor
@NoArgsConstructor
public class YueLikeEntity extends BaseEntity<YueLikeEntity>  {
    private static final long serialVersionUID = -845608304374944981L;
    /**
     * id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 喜爱
     */
    @TableField(value = "yue_like")
    private String content;

    /**
     * 讨厌
     */
    @TableField(value = "yue_disgusting")
    private String disgusting;

    /**
     * 原因
     */
    @TableField(value = "yue_reason")
    private String reason;
}