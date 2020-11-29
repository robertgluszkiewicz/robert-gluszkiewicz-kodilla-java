package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent europa = new Continent();
        africa.addCountry(new Country("Egypt", new BigDecimal("99000000")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("200000000")));
        asia.addCountry(new Country("China", new BigDecimal("1200000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("125000000")));
        europa.addCountry(new Country("France", new BigDecimal("35000000")));
        europa.addCountry(new Country("Spain", new BigDecimal("60000000")));
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europa);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("1719000000");

        //Then
        assertEquals(expectedResult, result);
    }
}