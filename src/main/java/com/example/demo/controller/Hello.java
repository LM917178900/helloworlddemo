package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leimin
 * @description
 * @time: 2019/09/10
 **/
@RestController
public class Hello {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello spring boot";
    }

}
