package com.example.dao;

import com.example.entity.MV;

import java.util.List;

public interface MVDao {
    //推荐
    List<MV> recommend();

    //通过id查mv
    MV findById(Integer id);
}
