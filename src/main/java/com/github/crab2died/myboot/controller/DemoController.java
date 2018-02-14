package com.github.crab2died.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("hello")
    public Object hello() {
        return "Hello, My Boot";
    }
}
