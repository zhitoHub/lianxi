package com.ate.controller;

import com.ate.pojo.FlowStepDef;
import com.ate.service.FlowStepDefService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/hotem")
public class FlowStepDefController {

    @Autowired
    private FlowStepDefService flowStepDefService;

    @PostMapping("/insert")
    public String insert(FlowStepDef flowStepDef){
        flowStepDefService.insert(flowStepDef);
        return "添加成功";
    }

    @DeleteMapping("/delete")
    public String delete(String id){
        flowStepDefService.delete(id);
        return "删除成功";
    }

    @GetMapping("/selectAll")
    public List<FlowStepDef> selectAll(FlowStepDef flowStepDef){
        return flowStepDefService.selectAll(flowStepDef);
    }

}
