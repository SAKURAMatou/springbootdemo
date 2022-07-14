package com.dl.controller;

import com.alibaba.fastjson.JSONObject;
import com.dl.inter.IUser;
import com.dl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@RestController
public class UserController {

    @Autowired
    private IUser userService;

//    @GetMapping("test")
    public String testController() {
        List<User> list = userService.list();
        return JSONObject.toJSONString(list);
    }
}
