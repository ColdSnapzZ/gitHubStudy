package com.example.spring_git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zht
 * @Date 2020/12/24 15:27
 * @Description
 */
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(){
        System.out.println("调用获取user方法2333666");
        //我更改了
        return "user";
    }

    public void test01(){

    }
}
