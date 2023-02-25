package com.example.controller;

import com.example.entity.MList;
import com.example.entity.Music;
import com.example.entity.Music_list;
import com.example.service.MListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/musicList")
public class MListController {

    @Autowired
    private MListService mListService;

    //向歌单中插入歌曲
    @GetMapping("/saveMusic")
    @ResponseBody
    public String saveMusic(@RequestParam("lid") Integer lid, @RequestParam("mid") Integer mid){

        String status;
        try{
            System.out.println(mid);
            System.out.println(lid);

            mListService.saveMusic(mid,lid);
            mListService.addSum(lid);
            status="已添加入歌单";
            System.out.println(status);
        }catch (Exception e){
            e.printStackTrace();
            status=e.getMessage();
        }

        return status;
    }

    @PostMapping("/saveList")
    @ResponseBody
    public String saveMList(@RequestBody MList mList){
        String status;

            try{
                mListService.saveMList(mList);
                status="插入成功";
            }catch (Exception e){
                e.printStackTrace();
                status=e.getMessage();
            }

        return status;
    }




//    查询用户创建的所有歌单
    @PostMapping("/findAllMList")
    @ResponseBody
    public List<MList> findAllMList(@RequestBody MList mList){
        return mListService.findAllMList(mList.getUid());
    }

    @PostMapping("/findByLid")
    @ResponseBody
    public List<Music> findByLid(@RequestBody Music_list music_list){
        return mListService.findByLid(music_list.getLid());
    }


}
