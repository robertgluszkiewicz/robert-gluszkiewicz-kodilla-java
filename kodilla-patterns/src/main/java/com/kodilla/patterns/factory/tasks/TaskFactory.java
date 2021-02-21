package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Soup for dinner", "Mushrooms", 15);
            case PAINTING:
                return new PaintingTask("Basement renovation", "black", "Door");
            case DRIVING:
                return new DrivingTask("Meet", "Pub", "FreeNow");
            default:
                return null;
        }
    }
}
