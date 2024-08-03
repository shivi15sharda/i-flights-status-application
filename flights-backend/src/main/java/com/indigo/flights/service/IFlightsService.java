package com.indigo.flights.service;

import com.indigo.flights.dto.FlightDetail;
import com.indigo.flights.responses.FlightStatusResponse;
import org.springframework.stereotype.Service;


public interface IFlightsService {

    //frontend APIs
    FlightStatusResponse getFlightStatus(String flightNumber);


    //admin functions
    String addFlightData(FlightDetail data);

    String updateFlightData(FlightDetail data);

}
