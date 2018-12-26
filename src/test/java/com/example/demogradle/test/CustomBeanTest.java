package com.example.demogradle.test;

import com.example.demogradle.bean.CustomBean;
import com.example.demogradle.config.MyConfig;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 16:03
 */
public class CustomBeanTest {
   @Test
   public void test(){

      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

      CustomBean customBean = ctx.getBean(MyConfig.class).getCustomBean();
      System.out.println(customBean.getId());

   }
}
