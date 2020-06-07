package com.taoge.spring.jms.impl;

import com.taoge.spring.jms.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class JmsServiceImpl implements JmsService {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendByQueue(String queue, String value) {
    }
}
