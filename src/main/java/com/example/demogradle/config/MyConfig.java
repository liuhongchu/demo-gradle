package com.example.demogradle.config;

import com.example.demogradle.bean.CustomBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuhongchun
 * @Date: 2018/12/25 15:56
 */
@Configuration
public class MyConfig {

   MyConfig() {
   }

   @Bean
   public CustomBean getCustomBean() {
      return new CustomBean();
   }
}
