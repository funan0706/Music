package com.example.controller;

import com.example.entity.Music;
import com.example.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @ResponseBody
    @PostMapping("/findAll")
    public List<Music> findAll(){
        return musicService.findAll();
    }

    @ResponseBody
    @PostMapping("/recommend")
    public List<Music> recommend(){
        return musicService.recommend();
    }

    @ResponseBody
    @PostMapping("/findByName")
    public Music findByName(@RequestBody Music music){
        String name=music.getTitle();
//        Music music1=musicService.findByName(name);
//        if(mu)
//        if()
        return musicService.findByName(name);
    }

    @ResponseBody
    @PostMapping("/findById")
    public Music findById(@RequestBody Music music){
        Integer id=music.getId();
        return musicService.findById(id);
    }
}
