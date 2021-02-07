package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private final String countryName;
    private final BigInteger peopleQuantity;

    public Country(final String countryName, final BigInteger peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryName.equals(country.countryName)) return false;
        return peopleQuantity.equals(country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + peopleQuantity.hashCode();
        return result;
    }
}