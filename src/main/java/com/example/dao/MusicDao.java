package com.example.dao;

import com.example.entity.Music;

import java.util.List;

public interface MusicDao {
    List<Music> findAll();

    //推荐首页
    List<Music> recommend();


    Music findByName(String name);

    Music findById(Integer id);
}
