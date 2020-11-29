package com.kodilla.testing.weather;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {

        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }

        double averageTemperature = sum / temperatures.getTemperatures().size();

        return averageTemperature;

    }

    public double calculateMedianTemperature() {

        int n = temperatures.getTemperatures().size();
        double[] temperatureArray = new double[n];
        int i = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureArray[i] = temperature.getValue();
            i++;
        }

        Arrays.sort(temperatureArray);

        if (temperatures.getTemperatures().size() % 2 != 0) {
            double medianTemperature = temperatureArray[(n+1)/2-1];

            return medianTemperature;

        } else {
            double medianTemperature = (temperatureArray[n/2-1] + temperatureArray[n/2])/2;

            return medianTemperature;
        }
    }
}