package com.example.autociwithgpt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 21:44
 */
@Configuration
public class JavaConfig {
    @Bean
    public BeanParent bean1(){
        return new Bean1();
    }

    @Bean
    public BeanParent bean2(){
        return new Bean2();
    }



}
