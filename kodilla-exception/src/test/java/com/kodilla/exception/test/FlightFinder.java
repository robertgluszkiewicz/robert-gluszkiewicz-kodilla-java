package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airport = new HashMap<>();
        airport.put("Chicago", false);
        airport.put("Rome", false);
        airport.put("Gdansk", true);
        airport.put("Berlin", true);
        airport.put("Los Angeles", true);
        airport.put("Zurich", true);

        if (airport.containsKey(flight.getArrivalAirport()) && airport.get(flight.getArrivalAirport())) {
            System.out.println("Travel from this airport to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival airport does not exist!");
        }
    }
}