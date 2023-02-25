package com.example.service;

import com.example.dao.MusicDao;
import com.example.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    private MusicDao musicDao;

    @Override
    public List<Music> findAll() {
        return musicDao.findAll();
    }

    public List<Music> recommend(){
        return musicDao.recommend();
    }


    public Music findById(Integer id) {
        return musicDao.findById(id);
    }


    public Music findByName(String title) {
        return musicDao.findByName(title);
    }
}
