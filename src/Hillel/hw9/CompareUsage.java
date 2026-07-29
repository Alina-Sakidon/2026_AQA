package Hillel.hw9;

//Написать программу, которая вместо золушки сортирует числа из начальной коллекции на 3 кучки:
//в первую - числа которые нацело делятся на 2, во вторую - числа которые делятся на 3,
//в третью - все остальные, которые не подходят под первые 2. Если число делится и на 2 и на 3,
//то оно попадает в обе кучки. Начальную коллекцию из 100 элеметов
//заполнить случайными числами (граничное значение 500)


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompareUsage {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int a = 0; a < 100; a++) {
            randomNumbers.add(random.nextInt(500));
        }
        System.out.println("Random namber's list: " + randomNumbers);

        List<Integer> divideByTwo = new ArrayList<>();
        List<Integer> divideByThree = new ArrayList<>();
        List<Integer> divideBoth = new ArrayList<>();

        for (Integer num : randomNumbers) {
            if (num % 2 == 0) {
                divideByTwo.add(num);
            }
            if (num % 3 == 0) {
                divideByThree.add(num);
            }
            if (num % 2 != 0 && num % 3 != 0) {
                divideBoth.add(num);
            }
        }

        System.out.println("By two: " + divideByTwo);
        System.out.println("By three: " + divideByThree);
        System.out.println("By both: " + divideBoth);


    }
}
