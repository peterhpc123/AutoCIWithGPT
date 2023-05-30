package com.example.autociwithgpt.exception;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 18:07
 */
public class LoginException extends Exception{

    String errMsg;

    public LoginException(String s) {
        errMsg=s;
    }
}
