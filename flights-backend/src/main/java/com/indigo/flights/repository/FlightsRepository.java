package com.indigo.flights.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indigo.flights.dto.FlightDetail;

@Repository
public interface FlightsRepository extends MongoRepository<FlightDetail, String> {
    //database interaction
}
