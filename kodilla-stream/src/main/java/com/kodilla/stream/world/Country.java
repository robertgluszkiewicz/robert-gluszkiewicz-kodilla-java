package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
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