package com.indigo.flights.constants;

public enum FlightStatus {

    LANDED("Landed"),
    DEPARTED("Departed"),
    CHECK_IN_OPEN("Check-in open"),
    CHECK_IN_CLOSED("Check-in closed"),
    BOARDING("Boarding started"),
    GATES_CLOSED("Gates closed"),
    GATES_OPEN("Gates open"),
    GATE_CHANGED("Gate changed"),
    CANCELLED("Cancelled"),
    DELAYED("Delayed");

    final String flightStatus;

    FlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }


}
