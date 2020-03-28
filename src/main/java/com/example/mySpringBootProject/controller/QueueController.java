package com.example.mySpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * 队列消息控制器
 * @author YuanZeHao
 * @create 03 27, 2020
 * @since 1.0.0
 */
@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping("/send")
    public void send() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "新发送的消息!");
    }

}
