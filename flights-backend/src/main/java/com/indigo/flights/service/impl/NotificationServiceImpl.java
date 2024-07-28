package com.indigo.flights.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.indigo.flights.service.INotificationService;

import static com.indigo.flights.constants.Commons.KAFKA_FLIGHT_TOPIC;

@Service
@Slf4j
public class NotificationServiceImpl implements INotificationService{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendNotification(String message) {
        log.info("Sending flight update alert...");
        try {
            kafkaTemplate.send(KAFKA_FLIGHT_TOPIC, message);
        } catch(Exception exception) {
            log.error("Unable to push notification", exception);
        }
    }
}
