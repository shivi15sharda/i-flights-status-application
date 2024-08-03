package com.indigo.flights.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.indigo.flights.constants.Commons.APPLICATION_JSON;
import static com.indigo.flights.constants.RestURIConstants.BASE_URI;
import static com.indigo.flights.constants.RestURIConstants.HEALTH;

@RestController
@Slf4j
public class HealthController {

    @GetMapping(value = BASE_URI+HEALTH, produces = APPLICATION_JSON)
    ResponseEntity<?> checkHealth() {
        log.info("Returning system health");
        return ResponseEntity.ok("All ok!");
    }

    @GetMapping(value = "/", produces = APPLICATION_JSON)
    ResponseEntity<?> checkHealthV1() {
        log.info("index page");
        return ResponseEntity.ok("Welcome to Indigo 6E");
    }
}
