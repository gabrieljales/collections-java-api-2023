package main.java.sandbox.list.search.exercise002;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    List<Integer> numberList;

    public SumNumbers() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public int calculateSum() {
        int total = 0;

        for (int number : numberList) {
            total += number;
        }

        return total;
    }

    public int findHighestNumber() {
        int highestNumber = 0;

        for (int number : numberList) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        return  highestNumber;
    }

    public int findLowestNumber() {
        int lowestNumber = 0;

        for (int number : numberList) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }

        return  lowestNumber;
    }

    public List<Integer> showNumberList() {
        return numberList;
    }
}
