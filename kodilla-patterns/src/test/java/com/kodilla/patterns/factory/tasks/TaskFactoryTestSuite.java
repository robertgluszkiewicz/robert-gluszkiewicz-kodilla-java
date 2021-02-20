package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    TaskFactory factory = new TaskFactory();
    Task driving = factory.makeTask(TaskFactory.DRIVING);
    Task painting = factory.makeTask(TaskFactory.PAINTING);
    Task shopping = factory.makeTask(TaskFactory.SHOPPING);

    @Test
    void testFactoryDrivingTask() {

        //Then
        assertNotNull(driving);
        assertEquals("Meet", driving.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {

        //Then
        assertNotNull(painting);
        assertEquals("Basement renovation", painting.getTaskName());
    }

    @Test
    void testFactoryShoppingTask() {

        //Then
        assertNotNull(shopping);
        assertEquals("Soup for dinner", shopping.getTaskName());
    }

    @Test
    void testExecutionTask() {

        //When
        painting.executeTask();
        shopping.executeTask();

        //Then
        assertFalse(driving.isTaskExecuted());
        assertTrue(painting.isTaskExecuted());
        assertTrue(shopping.isTaskExecuted());
    }
}