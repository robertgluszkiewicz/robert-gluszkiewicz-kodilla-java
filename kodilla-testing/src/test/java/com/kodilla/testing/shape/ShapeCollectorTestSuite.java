package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector = new ShapeCollector();
    Circle circle = new Circle(1);
    Square square = new Square(2);
    Triangle triangle = new Triangle(3, 4);

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @Nested
    @DisplayName("Tests for figures")
    class TestFigures {

        @Test
        void testAddFigure() {
            //Given
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(2, shapeCollector.getShapesList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesList().size());
        }

        @Test
        void testGetFigure() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(square, shapeCollector.getShapesList().get(1));
        }
    }

    @Nested
    @DisplayName("Tests for showing figure names")
    class TestShowFigures {

        @Test
        void testShowFigures() {
            //Given
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            String expectedResult = "[Circle (r = 1.0), Square (side = 2.0), Triangle (base = 3.0, height = 4.0)]";
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }
}