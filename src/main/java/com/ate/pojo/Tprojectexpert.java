package com.ate.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_project_expert")
public class Tprojectexpert {
    @TableId(value = "ID",type = IdType.NONE)
    String ID;
    @TableField("Project_id")
    String ProjectId;
    @TableField("Expert_id")
    String ExpertId;
}
