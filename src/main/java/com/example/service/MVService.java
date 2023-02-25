package com.example.service;

import com.example.entity.MV;

import java.util.List;

public interface MVService {
    List<MV> recommend();

    MV findById(Integer id);
}
