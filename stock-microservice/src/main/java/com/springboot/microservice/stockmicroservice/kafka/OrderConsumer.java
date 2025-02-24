package com.springboot.microservice.stockmicroservice.kafka;


import com.springboot.microservice.basedomains.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @autor Toufik Lamghari
 **/
@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent) {
        LOGGER.info("Consumed OrderEvent in Stock service: {}", orderEvent);
        // save the order event data into database
    }
}