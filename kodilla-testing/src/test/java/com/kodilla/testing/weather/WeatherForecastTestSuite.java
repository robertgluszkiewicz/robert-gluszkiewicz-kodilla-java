package com.kodilla.testing.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    WeatherForecast weatherForecast;

    @BeforeEach
    public void beforeEveryTest() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperatureWithMock() {

        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, averageTemperature);
    }

    @Test
    void testCalculateMedianTemperatureWithMock() {

        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, medianTemperature);
    }
}