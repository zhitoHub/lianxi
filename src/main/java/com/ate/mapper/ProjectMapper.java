package com.ate.mapper;

import com.ate.pojo.Project;
import com.ate.pojo.Texpert;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<com.ate.pojo.Project> {

    @Select("select t1.Project_name from t_project t1 where Project_id = #{projectId};")
    Project sellById(@PathVariable("projectId") String pid);


    /**
     * 点击已选评委---根据项目id查询这个项目的评委信息
     */
    @Select("select te.Expert_name , te.Dept from  t_project tp join t_project_expert tpe on tp.Project_id = tpe.Project_id join t_expert te on te.Expert_id = tpe.Expert_id where tp.Project_id = #{projectId};")
    List<Texpert> selectTexpert(@Param("projectId") String pid);
}
