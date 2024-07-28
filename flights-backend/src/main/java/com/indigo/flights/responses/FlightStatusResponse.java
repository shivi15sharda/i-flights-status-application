package com.indigo.flights.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightStatusResponse extends AbstractResponse{
        private String flightNumber;
        private String flightStatus;
        private String boardingGate;
        private String expectedDelay;
        private String remarks;
}
