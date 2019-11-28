package com.springcloud.practice.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-11-28 17:29
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}
