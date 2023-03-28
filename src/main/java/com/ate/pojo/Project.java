package com.ate.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_project")
public class Project {
    @TableId(value = "project_id",type = IdType.NONE)
    String ProjectId;
    @TableField(value = "project_name")//映射msyql字段
    String ProjectName;
    @TableField(value = "deputy_name")
    String DeputyName;
    @TableField(value = "telephone")
    String Telephone ;
    @TableField(value = "addr")
    String Addr;

}
