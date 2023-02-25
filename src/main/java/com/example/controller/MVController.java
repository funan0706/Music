package com.example.controller;

import com.example.entity.MV;
import com.example.entity.Music;
import com.example.service.MVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//?
@Controller
@RequestMapping("/mv")
public class MVController {

    @Autowired
    private MVService mvService;

    @ResponseBody
    @PostMapping("/recommend")
    public List<MV> recommend(){
        return mvService.recommend();
    }

    @ResponseBody
    @PostMapping("/findById")
    public MV findById(@RequestBody MV mv){
        return mvService.findById(mv.getId());
    }
}
