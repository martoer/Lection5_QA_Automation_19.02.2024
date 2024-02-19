package org.example;

import java.util.HashSet;

public class SetHash {
    public static void main(String[] args) {
        //creation of HashSet
        HashSet<String>  names = new HashSet<>();

        // Entering elements

        names.add("John");
        names.add("Albert");
        names.add("Bob");

        //Visualization of elements
        System.out.println("elements of HashSet: " + names);
    }
}
