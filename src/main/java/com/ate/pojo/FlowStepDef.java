package com.ate.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_flow_step_def")
public class FlowStepDef {

    @TableId(value = "Step_no",type = IdType.NONE)
    int StepNo;
    @TableField("Step_name")
    String StepName;
    @TableField("Limit_time")
    int LimitTime;
    @TableField("Step_des")
    String StepDes;
    @TableField("URL")
    String URL;
}
