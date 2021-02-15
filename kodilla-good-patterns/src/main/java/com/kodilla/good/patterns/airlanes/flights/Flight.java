package com.kodilla.good.patterns.airlanes.flights;

import java.time.LocalTime;

public class Flight {

    private Airport departure;
    private Airport arrival;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Flight(final Airport departure, final Airport arrival, final LocalTime departureTime, final LocalTime arrivalTime) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departure != flight.departure) return false;
        if (arrival != flight.arrival) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        return arrivalTime.equals(flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Departure: " + departure + " [" + departureTime + "]" + " Arrival: " + arrival + " [" + arrivalTime + "]";
    }
}
