package com.taoge.spring.jms;

public interface JmsService {

    void sendByQueue(String queue, String value);

}
