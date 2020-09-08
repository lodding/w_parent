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
 * @program: w_parent->WantToTellSayEntity
 * @description:
 * @author: szh
 * @create: 2020-08-27 21:39
 **/
@Data
@Accessors(chain = true)
@TableName("want_to_tell_you")
@AllArgsConstructor
@NoArgsConstructor
public class WantToTellSayEntity extends BaseEntity<WantToTellSayEntity> {
    private static final long serialVersionUID = -9131107593491854757L;

    /**
     * id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    @TableField(value = "article")
    private String article;

    /**
     * 图片路径
     */
    @TableField(value = "image_path")
    private String imagePath;

    /**
     * 文章标签
     */
    @TableField(value = "article_tag")
    private String articleTag;


}