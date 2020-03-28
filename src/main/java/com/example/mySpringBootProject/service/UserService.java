package com.example.mySpringBootProject.service;

import com.example.mySpringBootProject.po.User;

import java.util.List;

public interface UserService {

    /** 查询所有用户 */
    List<User> getAllUser();

    /** 删除用户 */
    void deleteUserById(Integer id);

}
