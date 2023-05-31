package com.example.autociwithgpt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-31 12:33
 */
@Data
@Setter
@Getter
public class UserDTO {
    String username;
    String password;
    String email;
}
