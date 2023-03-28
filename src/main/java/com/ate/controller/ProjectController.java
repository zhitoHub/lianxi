package com.ate.controller;

import com.ate.pojo.Project;
import com.ate.pojo.Texpert;
import com.ate.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@Slf4j
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    //查询所有数据
    @GetMapping("/selectAll")
    List<Project> selectAll(){
        return projectService.selectAll();
    }

    //新增数据
    @PostMapping("/add")
    void add(Project project){
        projectService.add(project);
    }

    //抽取专家
    @GetMapping("/selectTexpert")
    List<Texpert> selectTexpert(Project project){
        String projectId = project.getProjectId();
        return projectService.selectTexpert(projectId);
    }

    //查询工程名
    @GetMapping("/sellById")
    public Project sellById(Project project){
        return projectService.sellById(project);
    }

    @PutMapping("/update")
    public String update(Project project){
        projectService.update(project);
        return "修改成功";
    }
}
