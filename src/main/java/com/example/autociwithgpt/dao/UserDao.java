package com.example.autociwithgpt.dao;

import com.example.autociwithgpt.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User getUserByNameAndPassword(String name, String password);
}
