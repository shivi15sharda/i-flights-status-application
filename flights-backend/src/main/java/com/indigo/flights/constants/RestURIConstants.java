package com.indigo.flights.constants;

import static com.indigo.flights.constants.Commons.FLIGHT_NUMBER_PLACEHOLDER;

public interface RestURIConstants {

    //API Endpoints
    String HEALTH = "/health";
    String BASE_URI = "/api/flights";
    String CHECK_FLIGHT_STATUS = "/status/" + FLIGHT_NUMBER_PLACEHOLDER;
    String UPDATE_FLIGHT_STATUS = "/status/" + FLIGHT_NUMBER_PLACEHOLDER;
    String LIST_ALL_FLIGHTS = "/all";

    String ADD_FLIGHT_DATA = "/add";
    String UPDATE_FLIGHT_DATA = "/update";
}
