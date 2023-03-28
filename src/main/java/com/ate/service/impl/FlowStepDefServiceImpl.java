package com.ate.service.impl;

import com.ate.mapper.FlowStepDefMapper;
import com.ate.pojo.FlowStepDef;
import com.ate.service.FlowStepDefService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowStepDefServiceImpl extends ServiceImpl<FlowStepDefMapper, FlowStepDef> implements FlowStepDefService {

    @Autowired
    private FlowStepDefMapper flowStepDefMapper;

    @Override
    public void insert(FlowStepDef flowStepDef) {
        flowStepDefMapper.insert(flowStepDef);
    }

    @Override
    public void delete(String id) {
        flowStepDefMapper.delete(id);
    }

    @Override
    public List<FlowStepDef> selectAll(FlowStepDef flowStepDef) {
        return flowStepDefMapper.selectAll(flowStepDef);
    }


}
