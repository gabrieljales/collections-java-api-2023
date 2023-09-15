package main.java.sandbox.set.basicOperations.exercise002;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringsSet {
    private Set<String> stringSet;

    public UniqueStringsSet() {
        this.stringSet = new HashSet<>();
    }

    public void addString(String string) {
        stringSet.add(string);
    }

    public void removeString(String string) {
        if(!stringSet.isEmpty()) {
            stringSet.removeIf(s -> s.equalsIgnoreCase(string));
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verifyString(String string) {
        if(!stringSet.isEmpty()) {
            return stringSet.contains(string);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void showUniqueStrings() {
        System.out.println(stringSet);
    }
}
