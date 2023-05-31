package com.example.autociwithgpt.service;

import com.example.autociwithgpt.dao.UserDao;
import com.example.autociwithgpt.exception.SignupException;
import com.example.autociwithgpt.pojo.User;
import com.example.autociwithgpt.vo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-31 12:29
 */
@Service
public class Register {
    @Autowired
    UserDao userDao;

    public User check(UserDTO user) throws SignupException {
        String username=user.getUsername();
        String password=user.getPassword();
        if(username==null||"".equals(username)||password==null||"".equals(password)){
            throw new SignupException("username or password should not be empty!");
        }
        if(userDao.getUserByNameAndPassword(username,password)!=null){
            throw new SignupException("user already exists!");
        }else{
            User user1=new User();
            user1.setName(user.getUsername());
            user1.setPassword(user.getPassword());
            user1.setEmail(user.getEmail());
            userDao.save(user1);
            return user1;
        }
    }
}
