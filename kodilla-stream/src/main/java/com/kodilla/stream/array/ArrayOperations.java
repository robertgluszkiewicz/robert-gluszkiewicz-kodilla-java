package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .peek(System.out::println)
                .average()
                .getAsDouble();

        System.out.println("Average = " + average);
        return average;
    }
}