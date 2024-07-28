package com.indigo.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndigoFlightTrackerApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Indigo 6E!");
		SpringApplication.run(IndigoFlightTrackerApplication.class, args);
	}

}
