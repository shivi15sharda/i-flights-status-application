package com.indigo.flights.service;

import com.indigo.flights.dto.FlightDetail;
import com.indigo.flights.responses.FlightStatusResponse;
import org.springframework.stereotype.Service;


public interface IFlightsService {

    FlightStatusResponse getFlightStatus(String flightNumber);

    void updateFlightStatus(FlightDetail flightDetail);

}
