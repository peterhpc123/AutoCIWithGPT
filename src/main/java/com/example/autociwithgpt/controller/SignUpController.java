package com.example.autociwithgpt.controller;

import com.example.autociwithgpt.api.CommonResult;
import com.example.autociwithgpt.exception.SignupException;
import com.example.autociwithgpt.pojo.User;
import com.example.autociwithgpt.service.Register;
import com.example.autociwithgpt.vo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 22:57
 */
@Controller
public class SignUpController {
    @Autowired
    Register register;

    @PostMapping(value = "/signup")
    @ResponseBody
    public CommonResult signup(@RequestBody UserDTO user){
        try {
            register.check(user);
            return CommonResult.success(user);
        } catch (SignupException e) {
            return CommonResult.fail(e.getErrMsg(),user);
        }
    }
}
