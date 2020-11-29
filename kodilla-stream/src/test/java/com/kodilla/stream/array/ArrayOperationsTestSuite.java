package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @DisplayName("Test checks calculate with range() method and IntStream interface")
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        //When
        double expectedResult = 9.5;
        double result = IntStream.range(0, numbers.length)
                .map(item -> numbers[item])
                .average()
                .getAsDouble();

        IntStream.range(0, numbers.length)
                .map(item -> numbers[item])
                .forEach(v -> System.out.println(v));

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}