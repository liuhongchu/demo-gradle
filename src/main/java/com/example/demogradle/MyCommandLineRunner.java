package com.example.demogradle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 16:16
 * Spring Boot中初始化资源的几种方式
 * 第一种方式：
 * 1:实现 CommandLineRunner 接口，并实现它的 run() 方法，在该方法中编写初始化逻辑
 * 2:添加@Component 注解，注册bean
 * 实现了 CommandLineRunner 接口的 Component 会在所有 Spring Beans 初始化完成之后，
 * 在 SpringApplication.run() 执行之前完成
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
   @Override
   public void run(String... args) throws Exception {
         System.out.println("我是第一种初始化方式 。。。在类上实现 CommandLineRunner 接口。。。");
   }
}
