package JavaCore.hw7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
Конвертувати масив у список відповідного типу даних та повернути з методу.
        Наприклад:

Було Array [1, 2, 3]

Стало List [1, 2, 3]*/

public class ToListConverter {
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(20);
        }
        System.out.println("Array: " + Arrays.toString(randomNumbers));

        System.out.println("List: " + toList(randomNumbers));
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int num : numbers) {
            list.add(num);
        }
        return list;
    }
}
