package com.casic.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.*;
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

    //乐观锁版本号
    @Version
    @TableField(fill =FieldFill.INSERT)
    private Integer version;
}
