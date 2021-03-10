package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/10 18:50
 */
@Api(tags = "测试swagger")
@RestController
@RequestMapping(value = "/api")
public class TestSwagger {

    @RequestMapping("/swagger")
    public String getString() {
        return "swagger";
    }

}
