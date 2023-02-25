package com.example.service;

import com.example.entity.User;

public interface UserService {
    void save(User user);

    User login(String username,String password);

    User findById(Integer id);

    void update(User user);

    User findByName(String username);

}
