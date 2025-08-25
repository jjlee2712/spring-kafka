package com.spring_kafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class KafkaController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send/{msg}")
    public String send(@PathVariable String msg) {
        kafkaTemplate.send("orders", msg);
        return "Sent: " + msg;
    }
}
