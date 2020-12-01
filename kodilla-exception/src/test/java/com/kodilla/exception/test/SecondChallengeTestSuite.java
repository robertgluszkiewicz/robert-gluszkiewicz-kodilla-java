package com.kodilla.exception.test.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task 8.3")
public class SecondChallengeTestSuite {

    @Test
    void testSecondChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & then
        assertAll(
                //both value out of range
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 0)),
                //both values out of range
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1)),
                //both values in range
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                //"x" value in range and "y" value out of range
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                //"x" value out of range and "y" value in range
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5))
        );
    }
}