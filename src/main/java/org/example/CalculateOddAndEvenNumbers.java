package org.example;

import java.util.Scanner;

public class CalculateOddAndEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of elements in the Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int evenSUm = 0;
        int oddSumm = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSUm += array[i];
            } else {
                oddSumm += array[i];
            }

        }
        System.out.println("THe amount of Even Numbers in the Array is: " + evenSUm);
        System.out.println("THe amount of Odd Numbers in the Array is: " + oddSumm);
    }
}

