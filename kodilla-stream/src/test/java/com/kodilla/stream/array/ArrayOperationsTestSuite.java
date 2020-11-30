package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(9.5, average);
    }
}