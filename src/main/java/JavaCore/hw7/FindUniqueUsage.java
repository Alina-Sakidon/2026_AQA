package JavaCore.hw7;

/*3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень,
які можуть повторюватися в необмеженій кількості. Необхідно повернути новий числовий список, що містить
тільки унікальні числа.*/

/*4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр.
        Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
        Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
        Наприклад:

        bird: 2

        fox: 1

        cat: 1*/


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueUsage {
    public static void main(String[] args) {
        //Task 3
       /* Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Random list: " + numbers);
        System.out.println("Unique : " + findUnique(numbers));*/

        //Task 4
        List<String> animals = List.of(
                "bird", "tiger", "cat", "dog",
                "snake", "wolf", "wolf", "snake",
                "snake", "tiger", "tiger", "dog", "hamster"
        );
        //calcOccurrence(animals);

        System.out.println(findOccurrence(animals));

    }

    public static Set<Integer> findUnique(List<Integer> randomList) {
        return new HashSet<>(randomList);
    }

    public static void calcOccurrence(List<String> animals) {
        Map<String, Integer> animalMap = new HashMap<>();

        for (String animal : animals) {
            animalMap.put(animal, animalMap.getOrDefault(animal, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static List<Occurence> findOccurrence(List<String> animals) {

       /* Map<String, Integer> animalMap = new HashMap<>();

        for (String animal : animals) {
            animalMap.put(animal, animalMap.getOrDefault(animal, 0) + 1);
        }

        List<Occurence> listOccurrence = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
            listOccurrence.add(new Occurence(entry.getKey(), entry.getValue()));
        }
        return listOccurrence;*/


        //OR use stream
      return   animals.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .entrySet().stream()
              .map(entry -> new Occurence(entry.getKey(), Math.toIntExact(entry.getValue()))).toList();

    }

}
