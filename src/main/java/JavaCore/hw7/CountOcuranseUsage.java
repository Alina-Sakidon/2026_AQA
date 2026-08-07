package JavaCore.hw7;

//1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
//Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//Порахувати скільки разів зустрічається переданий рядок як другий аргумент.


import java.util.List;

public class CountOcuranseUsage {
    public static void main(String[] args) {
        List<String> words = List.of(
                "apple", "banana", "apple", "milk",
                "coffee", "apple", "tea", "banana",
                "apple", "bread", "bread", "bread", "coffee"
        );
        System.out.println(countOccurance(words, "apple"));
        System.out.println(countOccuranceByStream(words, "bread"));
    }

    public static int countOccurance(List<String> words, String word) {
        int count = 0;
        for (String el : words) {
            if (el.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static long countOccuranceByStream(List<String> words, String word) {
        return words.stream().filter(word::equals).count();
    }
}
