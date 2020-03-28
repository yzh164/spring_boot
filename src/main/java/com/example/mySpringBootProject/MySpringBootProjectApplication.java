package com.example.mySpringBootProject;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;


/**
 * @EnableCaching 开启缓存
 */
@SpringBootApplication
@EnableCaching
public class MySpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("active.queue");
	}

}
