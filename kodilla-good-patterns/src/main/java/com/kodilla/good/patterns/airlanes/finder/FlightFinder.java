package com.kodilla.good.patterns.airlanes.finder;

import com.kodilla.good.patterns.airlanes.flights.Airport;
import com.kodilla.good.patterns.airlanes.flights.Flight;
import com.kodilla.good.patterns.airlanes.flights.FlightsDatabase;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    private final FlightsDatabase flightsDatabase = new FlightsDatabase();

    public Set<Flight> departureFinder(Airport departure) {

        Set<Flight> foundDepartures = flightsDatabase.createFlightDatabase().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        return foundDepartures;
    }

    public Set<Flight> arrivalFinder(Airport arrival) {

        Set<Flight> foundArrivals = flightsDatabase.createFlightDatabase().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        return foundArrivals;
    }

    public Set<Flight> connectingFlightFinder(Airport departure, Airport connect, Airport arrival) {

        Set<Flight> foundDepartureOfConnectingFlights = flightsDatabase.createFlightDatabase().stream()
                .filter(flight -> flight.getDeparture().equals(departure)
                && flight.getArrival().equals(connect))
                .collect(Collectors.toSet());

        Set<Flight> foundArrivalOfConnectingFlights = flightsDatabase.createFlightDatabase().stream()
                .filter(flight -> flight.getArrival().equals(arrival)
                        && flight.getDeparture().equals(connect))
                .collect(Collectors.toSet());

        Set<Flight> foundConnectingFlights = new HashSet<>();
        foundConnectingFlights.addAll(foundDepartureOfConnectingFlights);
        foundConnectingFlights.addAll(foundArrivalOfConnectingFlights);

        return foundConnectingFlights;
    }
}
