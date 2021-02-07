package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent europa = new Continent();
        africa.addCountry(new Country("Egypt", new BigInteger("99000000")));
        africa.addCountry(new Country("Nigeria", new BigInteger("200000000")));
        asia.addCountry(new Country("China", new BigInteger("1200000000")));
        asia.addCountry(new Country("Japan", new BigInteger("125000000")));
        europa.addCountry(new Country("France", new BigInteger("35000000")));
        europa.addCountry(new Country("Spain", new BigInteger("60000000")));
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europa);

        //When
        BigInteger result = world.getPeopleQuantity();
        BigInteger expectedResult = new BigInteger("1719000000");

        //Then
        assertEquals(expectedResult, result);
    }
}