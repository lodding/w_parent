package com.me.common.bo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @program: java-demo->BaseEntity
 * @description: 公共字段
 * @author: szh
 * @create: 2020-08-27 15:22
 **/
@Getter
@Setter
public class BaseEntity<T> extends Model<BaseEntity<T>> {


    /**
     * 创建者 Id
     */
    @TableField(value = "creator_id", fill = FieldFill.INSERT)
    private String creatorId;
    /**
     * 创建者 名称
     */
    @TableField(value = "creator_name", fill = FieldFill.INSERT)
    private String creatorName;
    /**
     * 创建时间
     */
    @TableField("gmt_create_time")
    private LocalDateTime gmtCreateTime;
    /**
     * 修改者 Id
     */
    @TableField(value = "modifier_id", fill = FieldFill.INSERT_UPDATE)
    private String modifierId;
    /**
     * 修改者 名称
     */
    @TableField(value = "modifier_name", fill = FieldFill.INSERT_UPDATE)
    private String modifierName;

    /**
     * 修改时间
     */
    @TableField("gmt_modify_time")
    private LocalDateTime gmtModifyTime;

    /**
     * 删除标识 1 已删除 0 未删除
     */
    @TableField("deleted")
    @TableLogic
    private Long deleted;
    /**
     * clientId
     */
    @TableField(value = "client_id", fill = FieldFill.INSERT)
    private String clientId;

    /**
     * 乐观锁
     * 特别说明:
     * <p>
     * 支持的数据类型只有:int,Integer,long,Long,Date,Timestamp,LocalDateTime
     * 整数类型下 newVersion = oldVersion + 1
     * newVersion 会回写到 entity 中
     * 仅支持 updateById(id) 与 update(entity, wrapper) 方法
     * 在 update(entity, wrapper) 方法下, wrapper 不能复用!!!
     * 不能 标记 任何类型的 fill 参数
     */
    @JsonIgnore
    //@Version
    @TableField(value = "version")
    private Long version;
}