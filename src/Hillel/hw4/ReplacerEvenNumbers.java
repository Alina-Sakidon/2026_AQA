package Hillel.hw4;

import java.sql.Array;
import java.util.Random;

//2 Написать программу, которая в массиве из случайных чисел заменяет все чётные числа
// на 0 и выводит полученный массив на экран. Для генерации случайных чисел можно использовать Random:
public class ReplacerEvenNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }

        System.out.println("Rundom array is: ");
        for (int num : randomArray) {
            System.out.println(num);
        }

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                randomArray[i] = 0;
            }
        }
        System.out.println("Changed array is: ");

        for (int num : randomArray) {
            System.out.println(num);
        }
    }
}
