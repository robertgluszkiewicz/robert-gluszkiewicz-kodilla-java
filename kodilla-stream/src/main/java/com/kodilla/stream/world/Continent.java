package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    Set<Country> continentCountries = new HashSet<>();

    public void addCountry(Country country) {
        continentCountries.add(country);
    }

    public Set<Country> getCountries() {
        return continentCountries;
    }

    public BigDecimal getPeopleQuantityOnContinent() {
        BigDecimal peopleQuantityOnContinent = BigDecimal.ZERO;

        for (Country country: continentCountries) {
            peopleQuantityOnContinent = peopleQuantityOnContinent.add(country.getPeopleQuantity());
        }

        return peopleQuantityOnContinent;
    }
}