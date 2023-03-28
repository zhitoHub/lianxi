package com.ate.service;

import com.ate.pojo.Project;
import com.ate.pojo.Texpert;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ProjectService extends IService<Project> {

    //查询所有数据
    List<Project> selectAll();

    //新增数据
    void add(Project project);

    List<Texpert> selectTexpert(String pid);

    Project sellById(Project project);

    void update(Project project);
}
