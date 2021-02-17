package com.kodilla.good.patterns.airlanes.printer;

import com.kodilla.good.patterns.airlanes.flights.Flight;

import java.util.Set;

public class FlightsPrinter {

    public void printFlights(Set<Flight> flights) {
        flights.stream()
                .forEach(System.out::println);
        System.out.println("");
    }
}
