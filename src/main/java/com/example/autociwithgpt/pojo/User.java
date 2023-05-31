package com.example.autociwithgpt.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @description:
 * @author: pehong
 * @date: 2023-05-30 17:37
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    long id;
    String name;
    String email;
    String password;
}
