package com.ate.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_expert")
public class Texpert {
    @TableId(value = "Expert_id", type = IdType.NONE)
    String expertId;
    @TableField(value = "Expert_name")
    String expertName;
    @TableField(value = "Id_card")
    String idCard;
    @TableField(value = "Dept")
    String dept;
}
