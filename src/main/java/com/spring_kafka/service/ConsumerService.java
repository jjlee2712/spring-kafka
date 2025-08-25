package com.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    
    @KafkaListener(topics = "orders", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Message Received: " + message);
    }
}
