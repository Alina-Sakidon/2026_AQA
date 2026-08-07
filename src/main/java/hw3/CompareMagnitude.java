package hw3;

import java.util.Scanner;

public class CompareMagnitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        if (Math.abs(firstNum) > Math.abs(secondNum)) {
            System.out.println("The bigest magnitude has number: " + firstNum);
        } else if (Math.abs(firstNum) < Math.abs(secondNum)) {
            System.out.println("The bigest magnitude has number: " + secondNum);
        } else {
            System.out.println("Both numbers have the same magnitude ");
        }
    }
}
