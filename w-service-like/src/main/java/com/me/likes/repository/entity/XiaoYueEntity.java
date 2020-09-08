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
 * @program: w_parent->XIaoYueEntity
 * @description:
 * @author: szh
 * @create: 2020-08-27 21:36
 **/
@Data
@Accessors(chain = true)
@TableName("xiao_yue")
@AllArgsConstructor
@NoArgsConstructor
public class XiaoYueEntity extends BaseEntity<XiaoYueEntity> {
    private static final long serialVersionUID = 5585447183990746328L;

    /**
     * id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private String age;

    /**
     * 身高
     */
    @TableField(value = "height")
    private String height;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private String birthday;
}