package com.example.mySpringBootProject.po;

import java.io.Serializable;

/**
 * 用户类
 * 为了方便数据的传输，需要实现 Serializable 接口
 */
public class User implements Serializable {
    private static final long serialVersionUID = -8944430850993619778L;
    private Integer id;
    private String username;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
