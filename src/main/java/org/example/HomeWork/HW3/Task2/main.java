package org.example.HomeWork.HW3.Task2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Items items1 = new Items("Мандарины", 180, "1", "Узбекистан", 3000);
        Items items2 = new Items("Гранат", 350, "2", "Узбекистан", 6000);
        Items items3 = new Items("Яблоки", 120, "1", "Узбекистан", 3000);
        Items items4 = new Items("Мандарины царские", 260, "1", "Азербайджан", 3500);
        Items items5 = new Items("Апельсины", 170, "3", "Азербайджан", 8000);

        List<Items> itemsList = new ArrayList<>();

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items4);
        itemsList.add(items5);

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String varietyInput = "";
        while (flag) {
            System.out.println("Введите  номер сорта (1-3)");
            String variety = scanner.nextLine();
            try {
                Integer.parseInt(variety);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число,поробуйте еще раз");
                continue;
            }
            if (Integer.parseInt(variety) < 0 || Integer.parseInt(variety) > 3) {
                System.out.println("Вы вели несуществующий номер сорта. Введите число от 1 до 3");
            } else {
                flag = false;
                varietyInput = variety;
            }

        }
        String productName = "";
        Integer minPrice = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getVariety().equals(varietyInput)) {

                minPrice = itemsList.get(i).getPrice();
            }
        }


        for (int i = 0; i < itemsList.size(); i++) {

            if (itemsList.get(i).getVariety().equals(varietyInput)) {

                if (itemsList.get(i).getPrice() <= minPrice) {
                    minPrice = itemsList.get(i).getPrice();
                    productName = itemsList.get(i).getNameProduct();
                }
            }

        }
        System.out.printf(productName);

    }

}



