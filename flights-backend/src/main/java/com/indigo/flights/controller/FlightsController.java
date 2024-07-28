package com.indigo.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.indigo.flights.constants.Commons.APPLICATION_JSON;
import static com.indigo.flights.constants.RestURIConstants.BASE_URI;
import static com.indigo.flights.constants.RestURIConstants.CHECK_FLIGHT_STATUS;
import com.indigo.flights.responses.FlightStatusResponse;
import com.indigo.flights.service.IFlightsService;

@RestController
@RequestMapping(BASE_URI)
public class FlightsController {

    @Autowired
    IFlightsService flightsService;

    @GetMapping(value = CHECK_FLIGHT_STATUS, produces = APPLICATION_JSON)
    ResponseEntity<FlightStatusResponse> checkFlightStatus(@PathVariable("flightNumber") String flightNumber) {
        FlightStatusResponse response = flightsService.getFlightStatus(flightNumber);
        return ResponseEntity.ok(response);
    }
}
