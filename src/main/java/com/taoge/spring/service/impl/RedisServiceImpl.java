package com.taoge.spring.service.impl;

import com.taoge.spring.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate=new RedisTemplate<String, Object>();

    public boolean setString(String key, String value) {
        redisTemplate.opsForValue().set(key,value,1000, TimeUnit.SECONDS);
        return true;
    }

    public String getString(String key) {
        if(redisTemplate.hasKey(key)){
            return redisTemplate.opsForValue().get(key).toString();
        }
        return null;
    }
}
