package com.example.demogradle;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 16:20
 * Spring Boot中初始化资源的几种方式
 * 第二种方式：
 * 1：实现 ApplicationRunner 接口，并实现它的 run() 方法，在该方法中编写初始化逻辑
 * 2：注册成Bean，添加 @Component注解即可
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

   @Override
   public void run(ApplicationArguments args) throws Exception {
      System.out.println("我是第二种初始化方式 。。。在类上实现ApplicationRunner接口。。");
   }
}
