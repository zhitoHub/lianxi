package com.ate.service;

import com.ate.pojo.FlowStepDef;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FlowStepDefService extends IService<FlowStepDef> {

    void insert(FlowStepDef flowStepDef);

    void delete(String id);

    List<FlowStepDef> selectAll(FlowStepDef flowStepDef);
}
