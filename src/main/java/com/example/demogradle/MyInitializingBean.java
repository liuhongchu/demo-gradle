package com.example.demogradle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 16:49
 * spring boot 中实现初始化的几种方法
 *  第四种方法
 *  1.实现InitializingBean 接口
 *  2.使用@Component 注入到bean
 */
@Component
public class MyInitializingBean implements InitializingBean {
   @Override
   public void afterPropertiesSet() throws Exception {
        System.out.println("第四种初始化方式。。。。实现InitializingBean 接口。。。");
   }
}
