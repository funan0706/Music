package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.JWTUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody User user){
        User user1=userService.findByName(user.getUsername());
        Map<String,Object> map=new HashMap<>();
        try{
            if(user1==null){
                map.put("state",false);
                map.put("msg","该用户不存在");
            }else if(!user1.getPassword().equals(user.getPassword())){
                map.put("state",false);
                map.put("msg","密码不正确，请重新输入");
            }else{
                Map<String,String> payload=new HashMap<>();
                payload.put("username",user.getUsername());
                String token= JWTUtils.getToken(payload);
                map.put("state",true);
                map.put("msg","登录成功");
                map.put("user",user1);
                map.put("token",token);
            }
        }catch (Exception e){
            map.put("state",false);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    //注册
    @PostMapping("/register")
    @ResponseBody
    public boolean register(@RequestBody User user){

        boolean state;
        User user1=userService.findByName(user.getUsername());
        if(user1==null){
            System.out.println("进入注册");
            userService.save(user);
            state=true;
            return true;
        }else{
            state=false;
            return state;
        }
    }

    //修改
    @PostMapping("/update")
    @ResponseBody
    public String update(@RequestBody User user){
        String status;
        try{
            userService.update(user);
            status="修改成功";
        }catch (Exception e){
            e.printStackTrace();
            status=e.getMessage();
        }
        return status;
    }

    @PostMapping("/findById")
    @ResponseBody
    public User findById(@RequestBody User user){
        User user1=userService.findById(user.getId());
        return user1;
    }
}
