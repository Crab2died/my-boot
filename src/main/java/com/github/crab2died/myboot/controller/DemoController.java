package com.github.crab2died.myboot.controller;

import com.github.crab2died.myboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    public DemoService demoService;

    @RequestMapping("hello")
    @ResponseBody
    public Object hello() {
        return "Hello, My Boot";
    }

    @RequestMapping("list")
    @ResponseBody
    public Object list(String demo) {
        return demoService.list(demo);
    }
}
