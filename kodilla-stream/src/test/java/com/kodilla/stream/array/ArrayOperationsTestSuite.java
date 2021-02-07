package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @DisplayName("Test checks calculate with range() method and IntStream interface")
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(3.5, average);
    }
}