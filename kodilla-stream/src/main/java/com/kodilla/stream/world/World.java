package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public final class World {

    private final Set<Continent> continents = new HashSet<>();

    public void addContinent (Continent continent) {
        continents.add(continent);
    }

    public BigInteger getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum.add(current));
    }

}