package com.example.dao;

import com.example.entity.MList;
import com.example.entity.Music;

import java.util.List;

public interface MListDao {
    void saveMusic(Integer mid,Integer lid);

    void saveMList(MList mList);

    List<MList> findAllMList(Integer uid);

    List<Music> findByLid(Integer lid);

    int addSum(Integer id);

//    Integer CountMusics();

//    String findNameByLid(Integer lid);

//    List<Music> findAllMusic(Integer uid);
//    void deleteMusic()
}
