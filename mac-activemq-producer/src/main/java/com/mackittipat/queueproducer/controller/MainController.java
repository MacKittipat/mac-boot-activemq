package com.mackittipat.queueproducer.controller;

import com.mackittipat.queueproducer.jms.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final static Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private Producer producer;

    @GetMapping
    public String indexGet() {
        return "index";
    }

    @PostMapping
    public String indexPost() {
        String text = "" + (Math.random() * 10000);
        log.info("Sending text = {}", text);

        producer.send("Hello " + text);
        return "index";
    }

}
