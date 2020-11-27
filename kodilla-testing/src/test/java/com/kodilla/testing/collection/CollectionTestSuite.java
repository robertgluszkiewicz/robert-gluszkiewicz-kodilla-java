package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when OddNumbersExterminator get empty list, " +
            "then exterminate should print empty line"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = Arrays.asList();
        List<Integer> expectedResult = Arrays.asList();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("when OddNumbersExterminator get filled numbers list, " +
            "then exterminate should return odd numbers list"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedResult = Arrays.asList(2, 4, 6);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}