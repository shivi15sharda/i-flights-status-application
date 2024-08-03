// AdminController.java
package com.indigo.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.indigo.flights.constants.Commons.APPLICATION_JSON;
import static com.indigo.flights.constants.RestURIConstants.BASE_URI;
import static com.indigo.flights.constants.RestURIConstants.ADD_FLIGHT_DATA;
import static com.indigo.flights.constants.RestURIConstants.UPDATE_FLIGHT_DATA;

import com.indigo.flights.dto.FlightDetail;
import com.indigo.flights.responses.FlightStatusResponse;
import com.indigo.flights.service.IFlightsService;

@RestController
@RequestMapping(BASE_URI)
public class AdminController {

    @Autowired
    IFlightsService flightsService;

    @PostMapping(ADD_FLIGHT_DATA)
    ResponseEntity<?> addFlightData(@RequestBody FlightDetail flightDetail) {
        String response = flightsService.addFlightData(flightDetail);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update")
    ResponseEntity<?> updateFlightData(@RequestBody FlightDetail flightDetail) {
        String response = flightsService.updateFlightData(flightDetail);
        return ResponseEntity.ok(response);
    }
}
