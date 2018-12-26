package com.example.demogradle;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 16:23
 * Spring Boot中初始化资源的几种方式
 * 第三种初始化方式
 *  使用@PostConstruct注解，添加到类的方法上即可
 */
@Component
public class MyPostConstruct {

   @PostConstruct
   public void  getPostConstruct(){
      System.out.println("我是第三种初始化方式... 在方法上使用@PostConstruct注解...");
   }
}
