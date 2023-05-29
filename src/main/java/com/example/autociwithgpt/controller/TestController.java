package com.example.autociwithgpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-29 20:51
 */
@RestController
public class TestController {
    @GetMapping("/sabrinanpeter")
    public String hello(){
        return "我刚写好的高时延低可靠系统！";
    }
}
