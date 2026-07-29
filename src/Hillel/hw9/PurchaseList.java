package Hillel.hw9;

/*Создать программу - список покупок. В список вносится название товара и количество.
Список заполнить случайными товарами. В конце вывести общее количество товаров, добавленных в список.*/

import java.util.*;

public class PurchaseList {
    public static void main(String[] args) {
        Random random = new Random();

        List<String> productNames = new ArrayList<>(List.of("Milk", "Bread", "Cheese", "Butter", "Apple",
                "Banana", "Coffee", "Tea", "Eggs", "Chocolate"));

        Map<String, Integer> productsList = new HashMap<>();
        int qtySum = 0;
        for (String product : productNames) {
            int qty = random.nextInt(20) + 1;
            productsList.put(product, qty);
            qtySum += qty;
        }
        System.out.println("Product list is: " + productsList);
        System.out.printf(" Products qty is: " + qtySum);
    }
}
