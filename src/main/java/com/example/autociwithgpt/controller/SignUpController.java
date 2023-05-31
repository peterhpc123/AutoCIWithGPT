package com.example.autociwithgpt.controller;

import com.example.autociwithgpt.api.CommonResult;
import com.example.autociwithgpt.exception.SignupException;
import com.example.autociwithgpt.pojo.User;
import com.example.autociwithgpt.service.Register;
import com.example.autociwithgpt.vo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 22:57
 */
@RestController
public class SignUpController {
    @Autowired
    Register register;

    @PostMapping("/signup")
    public CommonResult<User> signup(UserDTO user){
        try {
            User user1=register.check(user);
            return CommonResult.success(user1);
        } catch (SignupException e) {
            return CommonResult.fail();
        }
    }
}
