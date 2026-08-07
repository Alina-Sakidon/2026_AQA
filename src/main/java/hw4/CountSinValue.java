package hw4;

//1 Написать программу, которая печатает таблицу значений sin(x), где x это каждые 10 градусов от 0 до 360
public class CountSinValue {
    public static void main(String[] args) {
        for (int i = 0; i <= 360; i += 10) {
            System.out.println("sin(" + i + ") = " + Math.sin(i));
        }
    }
}
