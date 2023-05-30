package com.example.autociwithgpt.service;

import com.example.autociwithgpt.dao.UserDao;
import com.example.autociwithgpt.exception.LoginException;
import com.example.autociwithgpt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 17:48
 */
@Service
public class Search {

    @Autowired
    UserDao userDao;

    public String speak(String username, String password) throws LoginException {
        User user=userDao.getUserByNameAndPassword(username, password);
        if(user==null){
            throw new LoginException("please input correct username or password!");
        }
        return "hello" +user.getName()+"!";
    }
}
