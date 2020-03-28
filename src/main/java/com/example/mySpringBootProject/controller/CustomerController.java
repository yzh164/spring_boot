/*
 * YvesHe: a project for test.
 * Copyright (c) 2016-present, www.yveshe.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.example.mySpringBootProject.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息监听者
 *
 * @author YuanZeHao
 * @create 03 27, 2020
 * @since 1.0.0
 */
@RestController
public class CustomerController {

    /**
     * 监听和读取消息
     * @JmsListener 是 spring 所提供的监听 JMS 消息的注解，该注解属性 destination 用于指定监听目的地
     * @param message
     */
    @JmsListener(destination = "active.queue")
    public void readActiveQueue(String message){
        System.out.println("接收到：" + message);
    }

}
