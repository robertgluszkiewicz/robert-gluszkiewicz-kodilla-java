package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("New task");
        board.getInProgressList().addTask("Task in progress");
        board.getDoneList().addTask("Finished task");

        //Then
        assertEquals("New task", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Finished task", board.getDoneList().getTasks().get(0));
    }
}
