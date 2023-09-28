package main.java.sandbox.map.search.exercise002;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private Map<String, Integer> wordCountMap;

    public WordCount() {
        this.wordCountMap = new HashMap<>();
    }

    public void addWord(String word, Integer count) {
        wordCountMap.put(word, count);
    }

    public void removeWord(String word) {
        if (!wordCountMap.isEmpty()) {
            wordCountMap.remove(word);
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }

    public void showWords() {
        System.out.println(wordCountMap);
    }

    public String getMostFrequentWord() {
        String mostFrequenteWord = null;
        int biggestCount = 0;

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > biggestCount) {
                biggestCount = entry.getValue();
                mostFrequenteWord = entry.getKey();
            }
        }
        return mostFrequenteWord;
    }
}
