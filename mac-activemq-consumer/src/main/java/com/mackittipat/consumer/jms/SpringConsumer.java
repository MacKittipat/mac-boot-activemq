package com.mackittipat.consumer.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SpringConsumer {

    private final static Logger log = LoggerFactory.getLogger(SpringConsumer.class);

    @JmsListener(destination = "${app.queue.name}")
    public void consume(String text) {
        log.info("Receiving {}", text);
    }
}
