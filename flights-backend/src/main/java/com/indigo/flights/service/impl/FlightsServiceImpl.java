package com.indigo.flights.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indigo.flights.dto.FlightDetail;
import com.indigo.flights.repository.FlightsRepository;
import com.indigo.flights.responses.FlightStatusResponse;
import com.indigo.flights.service.IFlightsService;

@Service
@Slf4j
public class FlightsServiceImpl implements IFlightsService {

    @Autowired
    private FlightsRepository flightsRepository;

    @Override
    public FlightStatusResponse getFlightStatus(String flightNumber) {
        log.info("Fetching current flight status...");
        FlightDetail dbResponse = flightsRepository.findById(flightNumber).orElse(null);
        return (dbResponse != null) ? FlightStatusResponse.builder()
                .flightStatus(dbResponse.getStatus())
                .flightNumber(dbResponse.getFlightNumber())
                .boardingGate(dbResponse.getGate())
                .expectedDelay(dbResponse.getDelay())
                .build() : null;
    }

    public void updateFlightStatus(FlightDetail flightDetail) {
        log.info("Uploading flight status...");
        try {
            flightsRepository.save(flightDetail);
        } catch(Exception exception) {
            log.error("Unable to upload flight detail", exception);
        }
    }
}
