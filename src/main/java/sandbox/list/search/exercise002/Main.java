package main.java.sandbox.list.search.exercise002;

public class Main {
    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.addNumber(1);
        sumNumbers.addNumber(5);
        sumNumbers.addNumber(9);
        sumNumbers.addNumber(12);

        System.out.println("Menor número: " + sumNumbers.findLowestNumber());
        System.out.println("Maior número: " + sumNumbers.findHighestNumber());
        System.out.println("Soma: " + sumNumbers.calculateSum());
        System.out.println("Lista: " + sumNumbers.showNumberList());
    }
}
