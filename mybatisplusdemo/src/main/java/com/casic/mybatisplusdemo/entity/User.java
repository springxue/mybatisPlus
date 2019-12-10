package com.casic.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class User {
//    @TableId(type = IdType.ID_WORKER)
    private Long id;//mysql中bigInt类型对应java中的long
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;//在添加数据的时候填充创建时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;//在修改数据的时候填充修改时间

}
