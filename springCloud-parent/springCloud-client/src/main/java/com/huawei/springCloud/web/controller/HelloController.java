package com.huawei.springCloud.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luomu
 * @create 2018-12-01 16:01
 **/
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("1")
    public String hello() {
        return "hello springCloud";
    }
}
