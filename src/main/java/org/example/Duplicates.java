package org.example;

import java.util.HashMap;

public class Duplicates {
    public static void main(String[] args) {
        String[] words = {"apple", "apple", "apple", "box", "box", "Varna"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
