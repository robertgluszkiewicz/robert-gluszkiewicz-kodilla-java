package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapesList = new ArrayList<>();

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public Shape addFigure(Shape shape) {
        shapesList.add(shape);
        return shape;

    }

    public void removeFigure(Shape shape) {
        shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapesList.get(n);
    }

    public String showFigures() {
        System.out.println(shapesList);
        return shapesList.toString();
    }
}