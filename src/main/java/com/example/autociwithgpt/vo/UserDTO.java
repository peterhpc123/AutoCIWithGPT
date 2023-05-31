package com.example.autociwithgpt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-31 12:33
 */
@Data
public class UserDTO {
    String username;
    String password;
    String email;
}
