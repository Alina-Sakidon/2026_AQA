package hw3;

import java.util.Scanner;

public class PrintMonthInWord {
    public static Scanner scanner;

    public static Scanner createScunner() {
        scanner = new Scanner(System.in);
        System.out.println("Enter month by number: ");
        return scanner;
    }

    public static void isDataValidCheck(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Enter CORRECT month number");
            scanner.next();
        }
    }

    public static void printMonthNameUsingSwitchCase(Integer val) {
        switch (val) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }
    }

    public static void printMothNameUsingIfElse(Integer month) {
        if (month == 1) {
            System.out.println("JEN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MARCH");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("JUN");
        } else if (month == 7) {
            System.out.println("JUL");
        } else if (month == 8) {
            System.out.println("AUG");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }
    }

    public static void main(String[] args) {
        scanner = createScunner();
        isDataValidCheck(scanner);
        int month = scanner.nextInt();
        //printMothNameUsingIfElse(month);
        printMonthNameUsingSwitchCase(month);
    }
}
