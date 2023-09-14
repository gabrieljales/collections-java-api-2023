package main.java.sandbox.list.search.exercise002;

public class Main {
    public static void main(String[] args) {
        NumberSorting numberSorting = new NumberSorting();

        numberSorting.addNumber(4);
        numberSorting.addNumber(9);
        numberSorting.addNumber(2);
        numberSorting.addNumber(3);

        numberSorting.showNumbers();
        System.out.println(numberSorting.orderByAscendingOrder());
        System.out.println(numberSorting.orderByDescendingOrder());
    }
}
