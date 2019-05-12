package com.mackittipat.queueproducer.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SpringProducer implements Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${app.queue.name}")
    private String queueName;

    @Override
    public void send(String text) {
        jmsTemplate.convertAndSend(queueName, text);
    }
}
