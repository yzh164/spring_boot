package com.example.mySpringBootProject.service.impl;

import com.example.mySpringBootProject.mapper.UserMapper;
import com.example.mySpringBootProject.po.User;
import com.example.mySpringBootProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    /** 注入用户 Mapper */
    @Autowired
    private UserMapper userMapper;

    /**
     * @Cacheable 的 key 除了需要加英文双引号之外，还需要用英文单引号，否则系统在执行缓存操作将出错
     * 查询所有用户
     * */
    @Cacheable(value = "UserCache", key = "'user.getAllUser'")
    @Override
    public List<User> getAllUser() {
        return this.userMapper.getAllUser();
    }

    /**
     * 删除用户
     * @CacheEvict 删除 Redis 中的缓存数据，保证数据的一致性
     * @param id
     */
    @CacheEvict(value = "UserCache", key = "'user.getAllUser'")
    @Override
    public void deleteUserById(Integer id) {
        System.out.println("删除 id 为【 " + id + " 】的用户");
        this.userMapper.delete(id);
    }
}
