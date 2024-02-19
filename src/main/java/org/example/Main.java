package org.example;
import java.util.ArrayList;
public class Main {
    private static ArrayList indexMultiplyByFive;
    public static void main(String[] args) {
        // Създаване на масив с 20 елемента от целочислен тип
        int [] array = new int [20];

        // Инициализация на елементи на масива
        for (int i = 0; i < array.length; i++) {
            array [i] = i * 5;
        }

        // Изваждане на елементите на масива в конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент " + i+1 + ": " + array[i]);
        }
    }
}