package com.indigo.flights.constants;

public interface Commons {

    String FLIGHT_NUMBER_PLACEHOLDER = "{flightNumber}";
    String FLIGHT_INITIAL = "6E";

    //content type
    String APPLICATION_JSON = "application/json";

    //response constants
    String NO_RECORDS = "No records found";

    //kafka template
    String KAFKA_FLIGHT_TOPIC = "flight-updates";
    String KAFKA_FLIGHT_GROUP_ID = "flight-updates";
}
