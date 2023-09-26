package main.java.sandbox.map.basicOperations.exercise002;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionaryMap.put(word, definition);
    }

    public void removeWord(String word) {
        if (!dictionaryMap.isEmpty()) {
            dictionaryMap.remove(word);
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }

    public void showWords() {
        System.out.println(dictionaryMap);
    }

    public String findDefinitionByWord(String word) {
        if (!dictionaryMap.isEmpty()) {
            return dictionaryMap.get(word);
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }
}
