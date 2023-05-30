package com.example.autociwithgpt.controller;

import com.example.autociwithgpt.exception.LoginException;
import com.example.autociwithgpt.service.Search;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-29 20:51
 */
@RestController
public class TestController {
    @Autowired
    Search search;
    @GetMapping("/sabrinanpeter")
    public String hello(){
        return "我刚写好的高时延低可靠系统！";
    }

    @GetMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username, @PathVariable("password") String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
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
