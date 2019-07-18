package com.lic.controller;

import com.lic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichai
 * @date 17:56 2019/7/15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    public String getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("sdasdasdsa");
        return "我可以访问啦！！！！！";
    }
}
