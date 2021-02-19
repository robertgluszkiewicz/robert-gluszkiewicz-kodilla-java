package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //Then
        assertNotNull(driving);
        assertEquals("Meet", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertNotNull(painting);
        assertEquals("Basement renovation", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertNotNull(shopping);
        assertEquals("Soup for dinner", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
}