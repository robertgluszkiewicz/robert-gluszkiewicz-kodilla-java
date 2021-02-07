package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final Set<Country> continentCountries = new HashSet<>();

    public void addCountry(Country country) {
        continentCountries.add(country);
    }

    public Set<Country> getCountries() {
        return continentCountries;
    }
}