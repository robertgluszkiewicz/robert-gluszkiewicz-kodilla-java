package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {

        //Given
        logger = Logger.INSTANCE;
        logger.log("File not found.");

        //When
        String theLastLog = logger.getLastLog();

        //Then
        assertEquals("File not found.", theLastLog);
    }
}
