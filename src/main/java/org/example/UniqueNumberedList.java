package org.example;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumberedList {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 3, 4, 4, 5, 5, 5};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {

            uniqueNumbers.add(i);
        }
        for (int unique = 0; unique < numbers.length; unique++) {
            System.out.println(unique);
        }
    }
}
