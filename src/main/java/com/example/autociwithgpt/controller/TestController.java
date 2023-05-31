package com.example.autociwithgpt.controller;

import com.example.autociwithgpt.config.Bean1;
import com.example.autociwithgpt.config.BeanParent;
import com.example.autociwithgpt.exception.LoginException;
import com.example.autociwithgpt.service.Search;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-29 20:51
 */
@RestController
public class TestController {
    @Autowired
    BeanParent bean1;

    @Autowired
    BeanParent bean2;

    @Autowired
    Search search;
    @GetMapping("/sabrinanpeter")
    public String hello(){
        return "我刚写好的高时延低可靠系统！";
    }

    @PostMapping(value = "/signin")
    public String login(@RequestParam String username,@RequestParam String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            return search.speak(username,password);
        } catch (LoginException e) {
            response.sendRedirect("/error1");
            return "";
        }
    }

    @GetMapping("/error1")
    public String error(){
        return "please input correct username or password!";
    }
}
