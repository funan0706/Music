package com.example.service;

import com.example.entity.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    Music findByName(String title);

    List<Music> recommend();

    Music findById(Integer id);
}
