package com.example.service;

import com.example.dao.MVDao;
import com.example.entity.MV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MVServiceImpl implements MVService{

    @Autowired
    private MVDao mvDao;

    @Override
    public List<MV> recommend() {
        return mvDao.recommend();
    }

    @Override
    public MV findById(Integer id) {
        return mvDao.findById(id);
    }
}
