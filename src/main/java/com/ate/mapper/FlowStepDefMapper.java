package com.ate.mapper;

import com.ate.pojo.FlowStepDef;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface FlowStepDefMapper extends BaseMapper<FlowStepDef> {

    @Delete("delete from t_flow_step_def where Step_no = #{StepNo};")
    public void delete(@PathVariable("StepNo") String id);

    @Select("select t.Step_no,t.Step_name from t_flow_step_def t ;")
    public List<FlowStepDef> selectAll(FlowStepDef flowStepDef);
}
