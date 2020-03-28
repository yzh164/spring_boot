package com.example.mySpringBootProject.controller;

import com.example.mySpringBootProject.po.User;
import com.example.mySpringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 * @author YuanZeHao
 * @create 03 26, 2020
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /** 注入用户 Service */
    @Autowired
    private UserService userService;

    /** 查询所有用户 */
    @RequestMapping("/list")
    public List<User> getAllUser(){
        return this.userService.getAllUser();
    }

    /** 根据用户 ID 删除用户 */
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        this.userService.deleteUserById(id);
    }

}
