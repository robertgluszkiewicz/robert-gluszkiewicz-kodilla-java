package com.kodilla.good.patterns.airlanes.flights;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {

    public Set<Flight> flightSet = new HashSet<>();

    public Set<Flight> createFlightDatabase() {

        flightSet.add(new Flight(Airport.KRAKOW, Airport.WARSAW,
                LocalTime.of(6,11), LocalTime.of(6, 51)));
        flightSet.add(new Flight(Airport.KRAKOW, Airport.WARSAW,
                LocalTime.of(9,11), LocalTime.of(9, 51)));
        flightSet.add(new Flight(Airport.KRAKOW, Airport.POZNAN,
                LocalTime.of(7,11), LocalTime.of(7, 44)));
        flightSet.add(new Flight(Airport.KRAKOW, Airport.GDANSK,
                LocalTime.of(8,22), LocalTime.of(9, 15)));
        flightSet.add(new Flight(Airport.GDANSK, Airport.WARSAW,
                LocalTime.of(12,12), LocalTime.of(12, 52)));
        flightSet.add(new Flight(Airport.GDANSK, Airport.POZNAN,
                LocalTime.of(13,13), LocalTime.of(13, 43)));
        flightSet.add(new Flight(Airport.GDANSK, Airport.KRAKOW,
                LocalTime.of(14,14), LocalTime.of(15, 9)));
        flightSet.add(new Flight(Airport.POZNAN, Airport.GDANSK,
                LocalTime.of(8,30), LocalTime.of(9, 10)));
        flightSet.add(new Flight(Airport.POZNAN, Airport.KRAKOW,
                LocalTime.of(15,15), LocalTime.of(15, 55)));
        flightSet.add(new Flight(Airport.POZNAN, Airport.WARSAW,
                LocalTime.of(16,16), LocalTime.of(16, 46)));
        flightSet.add(new Flight(Airport.WARSAW, Airport.GDANSK,
                LocalTime.of(9,55), LocalTime.of(10, 35)));
        flightSet.add(new Flight(Airport.WARSAW, Airport.GDANSK,
                LocalTime.of(11,40), LocalTime.of(12, 15)));

        return flightSet;
    }
}
