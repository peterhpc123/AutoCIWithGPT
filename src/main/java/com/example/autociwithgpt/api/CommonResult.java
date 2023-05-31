package com.example.autociwithgpt.api;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-31 13:12
 */
@Data
public class CommonResult<T> {
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    public CommonResult(long code, String message, T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(200, "注册成功",data);
    }

    public static <T> CommonResult<T> fail(String err, T data){
        return new CommonResult<T>(433,err,data);
    }
}
