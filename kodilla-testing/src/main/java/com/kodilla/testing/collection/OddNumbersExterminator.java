package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();

        if (numbers.isEmpty()) {
            System.out.print("");
        } else {
            for (int temporaryValue : numbers) {
                if ((temporaryValue % 2) == 0) {
                    oddNumbers.add(temporaryValue);
                }
            }
        }
        return oddNumbers;
    }
}