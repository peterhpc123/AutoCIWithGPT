package com.example.autociwithgpt.exception;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-31 12:46
 */
public class SignupException extends Throwable {
    String errMsg;

    public SignupException(String errMsg){
        this.errMsg=errMsg;
    }

    public String getErrMsg(){
        return errMsg;
    }
}
