package com.taoge.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class Config {

    @Autowired
    RedisTemplate redisTemplate;


    @Bean("My")
     Stu stu(){
//        redisTemplate.opsForHash().
        return new Stu();
    }
}
