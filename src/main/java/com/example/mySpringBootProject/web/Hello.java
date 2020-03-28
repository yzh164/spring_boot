package com.example.mySpringBootProject.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相当于 @Controller + @ResponseBody 组合在一起
 * @SpringBootConfig  该注解与 @Configuration 的作用相同，它表示其标注的类是 IOC 容器
 * @EnableAutoConfiguration  用于将所有符合自动配置的 bean 加载到当前 Spring Boot 创建并使用的 IOC 容器
 * @ComponentScan  用于自动扫描和加载符合条件的组件或 Bean ，并将 Bean 加载到 IOC 容器中
 * 实际上，@SpringBootApplication 就是这个三个注解的结合
 * */
@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/index")
    public String index(){
        return "hello yzh is my first project!";
    }

}
