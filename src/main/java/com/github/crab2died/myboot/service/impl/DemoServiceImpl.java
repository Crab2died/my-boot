package com.github.crab2died.myboot.service.impl;

import com.github.crab2died.myboot.domain.Demo;
import com.github.crab2died.myboot.mapper.DemoMapper;
import com.github.crab2died.myboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<Demo> list(String demo) {
        return demoMapper.list(demo);
    }
}
