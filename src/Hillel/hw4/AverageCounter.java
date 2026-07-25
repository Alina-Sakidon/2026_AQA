package Hillel.hw4;

import java.util.Random;

//3 Написать программу, которая считает среднее арифметическое
// всех элементов в массиве из 10 случайных чисел.
public class AverageCounter {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        Random random = new Random();

        System.out.println("Random values array: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
            System.out.println(randomArray[i]);
        }
        int sumValue = 0;

        for (int i = 0; i < randomArray.length; i++) {
            sumValue += randomArray[i];
        }
        System.out.println("Average value is: " + (double) sumValue / randomArray.length);
    }
}
