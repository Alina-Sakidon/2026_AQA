package Hillel.hw9;

/*Написать программу, которая удаляет из коллекции целых чисел все дубликаты, если они есть. Коллекцию из 100
элементов заполнить случайными числами (граница - 20). Вывести обе
коллекции на экран и количество удалённых дубликатов (при желании -
решить несколькими способами и сравнить какой из них быстрее)*/

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {
        List<Integer> numbersRandom = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numbersRandom.add(random.nextInt(20));
        }
        System.out.println("Random list: " + numbersRandom);
//1 case
        long now1 = System.nanoTime();
        Set<Integer> uniqueNumbers = new HashSet<>(numbersRandom);
        System.out.println("Unique numbers with HashSet: " + uniqueNumbers);
        System.out.println(System.nanoTime()- now1);
        System.out.println("Qty of deleted duplicates: " + (numbersRandom.size() - uniqueNumbers.size()));

 //2 case
        long now2 = System.nanoTime();
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : numbersRandom){
            if(!uniqueList.contains(number)){
                uniqueList.add(number);
            }
        }
        System.out.println("Unique list with ArrayList" + uniqueList);
        System.out.println(System.nanoTime()- now2);
        System.out.println("Qty of deleted duplicates: " + (numbersRandom.size() - uniqueList.size()));

//3 case
        long now3 = System.nanoTime();
        List<Integer> uniqueListByStream = numbersRandom.stream().distinct().toList();
        System.out.println("Unique list by Stream: " +uniqueListByStream);
        System.out.println(System.nanoTime()- now3);

    }

}
