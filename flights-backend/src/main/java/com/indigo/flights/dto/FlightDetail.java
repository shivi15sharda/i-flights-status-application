package com.indigo.flights.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flightStatus")
@Data
public class FlightDetail {
    @Id
    private String id;
    private String flightNumber;
    private String status;
    private String gate;
    private String delay;
}
