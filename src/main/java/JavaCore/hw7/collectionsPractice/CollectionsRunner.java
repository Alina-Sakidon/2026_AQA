package JavaCore.hw7.collectionsPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsRunner {
    public static void main(String[] args) {
        //Порахувати кількість кожного числа
        List<Integer> numbers = List.of(1, 3, 2, 1, 5, 3, 1, 2);

        Map<Integer, Long> occurrenceNumber = numbers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrenceNumber);

        //Згрупувати слова за першою літерою
        List<String> words = List.of(
                "apple",
                "ant",
                "banana",
                "bird",
                "cat",
                "car"
        );

        var a = words.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println(a);

        //Згрупувати числа на парні та непарні
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> mappedList = numbersList.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(mappedList);


    /*    із цього списку отримає

        {
        false=[apple, banana],
        true=[ant, bird, cat, car]
        }
        де:

        true — слова довжиною 3 символи;
        false — усі інші.*/

        List<String> wordsNew = List.of(
                "apple",
                "ant",
                "banana",
                "bird",
                "cat",
                "car"
        );

        System.out.println(wordsNew.stream().collect(Collectors.groupingBy(s->s.length()<=3)));
    }
}
