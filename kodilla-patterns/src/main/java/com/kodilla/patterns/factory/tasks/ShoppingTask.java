package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    boolean isExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
