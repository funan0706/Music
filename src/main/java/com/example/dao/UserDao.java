package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    //注册
    void save(User user);

    //登录
    User login(String username,String password);

    User findById(Integer id);

    User findByName(String username);

    void update(User user);
}
