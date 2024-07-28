package com.indigo.flights.service.consumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.indigo.flights.constants.Commons.KAFKA_FLIGHT_GROUP_ID;
import static com.indigo.flights.constants.Commons.KAFKA_FLIGHT_TOPIC;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = KAFKA_FLIGHT_TOPIC, groupId = KAFKA_FLIGHT_GROUP_ID)
    public void listen(String message) {
        //consuming message
        System.out.println("Received notification/alert as: " + message);
    }
}

