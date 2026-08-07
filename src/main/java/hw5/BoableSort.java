package hw5;

import java.util.Random;

public class BoableSort {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        Random random = new Random();

        System.out.println("Random array:");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
            System.out.printf("%s ,", randomArray[i]);
        }

        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < randomArray.length-1; i++) {
                int first;
                if (randomArray[i] > randomArray[i + 1]) {
                    first = randomArray[i];
                    randomArray[i] = randomArray[i + 1];
                    randomArray[i + 1] = first;
                    needSort = true;
                }
            }

        }

        System.out.println("\nSorted : ");
       for(int val: randomArray){
           System.out.printf("%s, ", val);
       }
    }
}
