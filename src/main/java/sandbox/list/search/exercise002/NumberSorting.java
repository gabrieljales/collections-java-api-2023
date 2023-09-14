package main.java.sandbox.list.search.exercise002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting {
    private List<Integer> numberList;

    public NumberSorting() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public List<Integer> orderByAscendingOrder() {
        List<Integer> numbersOrderedInAscendingOrder = new ArrayList<>(numberList);
        Collections.sort(numbersOrderedInAscendingOrder);

        return numbersOrderedInAscendingOrder;
    }

    public List<Integer> orderByDescendingOrder() {
        List<Integer> numbersOrderedInDescendingOrder = new ArrayList<>(numberList);
        numbersOrderedInDescendingOrder.sort(Collections.reverseOrder());

        return numbersOrderedInDescendingOrder;
    }

    public void showNumbers() {
        System.out.println(numberList);
    }
}
