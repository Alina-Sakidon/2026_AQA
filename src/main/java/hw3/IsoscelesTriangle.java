package hw3;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check if the triangle exists
        if (a + b > c && a + c > b && b + c > a) {

            // Check if it is isosceles
            if (a == b || a == c || b == c) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is NOT isosceles.");
            }

        } else {
            System.out.println("Such a triangle does not exist.");
        }
        scanner.close();
    }
}
