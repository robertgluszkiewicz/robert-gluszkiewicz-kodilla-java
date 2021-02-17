package com.kodilla.good.patterns.airlanes;

import com.kodilla.good.patterns.airlanes.finder.FlightFinder;
import com.kodilla.good.patterns.airlanes.flights.Airport;
import com.kodilla.good.patterns.airlanes.printer.FlightsPrinter;

public class Application {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        FlightsPrinter flightsPrinter = new FlightsPrinter();

        System.out.println("Odloty z Gdańska:");
        flightsPrinter.printFlights(flightFinder.departureFinder(Airport.GDANSK));

        System.out.println("Przyloty do Warszawy:");
        flightsPrinter.printFlights(flightFinder.arrivalFinder(Airport.WARSAW));


        System.out.println("Odlot z Krakowa przez Poznań do Gdańska:");
        flightsPrinter.printFlights(flightFinder.connectingFlightFinder(Airport.KRAKOW, Airport.POZNAN, Airport.GDANSK));
    }
}
