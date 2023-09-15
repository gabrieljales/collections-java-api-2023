package main.java.sandbox.set.basicOperations.exercise002;

public class Main {
    public static void main(String[] args) {
        UniqueStringsSet uniqueStringsSet = new UniqueStringsSet();

        uniqueStringsSet.addString("String 001");
        uniqueStringsSet.addString("String 002");
        uniqueStringsSet.addString("String 003");
        uniqueStringsSet.addString("String 004");
        uniqueStringsSet.addString("String 005");

        uniqueStringsSet.showUniqueStrings();

        uniqueStringsSet.removeString("String 002");

        uniqueStringsSet.showUniqueStrings();

        System.out.println(uniqueStringsSet.verifyString("String 004"));
    }
}
