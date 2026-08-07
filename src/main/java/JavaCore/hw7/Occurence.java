package JavaCore.hw7;

/*4. *** Створити метод findOccurance, що приймає на вхід рядковий список як параметр.
        Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
        Обчислити скільки разів трапляється кожне слово. Результат повернути у вигляді списку структур,
        що описують повторення кожного окремого взятого слова.
        Наприклад:
        [
        {name: "bird", occurrence: 2},
        {name: "fox", occurrence: 1},
        {name: "cat", occurrence: 1}
        ]*/

public class Occurence {
    private String name;
    private int occurence;

    Occurence(String name, int occurence){
        this.name = name;
        this.occurence = occurence;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurence=" + occurence +
                "}";
    }
}
