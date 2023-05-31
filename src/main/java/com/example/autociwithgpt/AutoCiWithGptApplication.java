package com.example.autociwithgpt;

import com.example.autociwithgpt.config.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoCiWithGptApplication {


    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(AutoCiWithGptApplication.class, args);
    }

}
