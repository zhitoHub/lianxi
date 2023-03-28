package com.ate.service.impl;

import com.ate.mapper.ProjectMapper;
import com.ate.pojo.Project;
import com.ate.pojo.Texpert;
import com.ate.service.ProjectService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private ProjectService projectService;

    @Override
    public List<Project> selectAll() {
        List<Project> list = projectMapper.selectList(null);
        return list;
    }

    @Override
    public void add(Project project) {
        projectMapper.insert(project);
    }

    @Override
    public List<Texpert> selectTexpert(String pid) {
        return projectMapper.selectTexpert(pid);
    }

    @Override
    public Project sellById(Project project) {
        String pid = project.getProjectId();
        return projectMapper.sellById(pid);
    }

    @Override
    public void update(Project project) {
        String projectId = project.getProjectId();
        if (Objects.isNull(projectId)){
            throw new RuntimeException("id不存在，修改失败");
        }
        projectMapper.updateById(project);//根据id修改信息 id不能修改
    }


}
