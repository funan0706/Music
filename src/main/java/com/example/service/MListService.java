package com.example.service;

import com.example.entity.MList;
import com.example.entity.Music;

import java.util.List;

public interface MListService {
    void saveMusic(Integer mid,Integer lid);

    void saveMList(MList mList);

    List<MList> findAllMList(Integer uid);

    List<Music> findByLid(Integer lid);

    void addSum(Integer id);

//    String findNameByLid(Integer lid);
}
