package com.taoge.spring.service;

public interface RedisService {

    boolean setString(String key, String value);


    String getString(String key);



}
