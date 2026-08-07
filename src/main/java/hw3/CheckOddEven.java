package hw3;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        System.out.println("Enter integer type value: ");

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Enter valid data");
            System.out.println("Be attentive, enter integer type value: ");
            scanner.next();
        }


        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
        scanner.close();
    }
}
