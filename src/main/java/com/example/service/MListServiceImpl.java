package com.example.service;

import com.example.dao.MListDao;
import com.example.entity.MList;
import com.example.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MListServiceImpl implements MListService{

    @Autowired
    private MListDao mListDao;

    @Override
    public void saveMusic(Integer mid, Integer lid) {
        mListDao.saveMusic(mid, lid);
    }

    @Override
    public void saveMList(MList mList) {
        mListDao.saveMList(mList);
    }

    @Override
    public List<MList> findAllMList(Integer uid) {
        return mListDao.findAllMList(uid);
    }

    @Override
    public List<Music> findByLid(Integer lid) {
        return mListDao.findByLid(lid);
    }

    @Override
    public void addSum(Integer id) {
        mListDao.addSum(id);
    }


}
