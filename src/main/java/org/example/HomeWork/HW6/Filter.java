package org.example.HomeWork.HW6;
import java.util.HashSet;
import java.util.Scanner;
public class Filter {
    public static void printFilter() {
        System.out.println("Выберите критерий сортировки:");
        System.out.println("1 - сортировка по ЦЕНЕ");
        System.out.println("2 - сортировка по ОБЬЕМУ ОПРЕТИВНОЙ ПАМЯТИ");
        System.out.println("3 - сортировка по ОПЕРАЦИОННОЙ СИСТЕМЕ");
    }
    public static void filterLaptop(HashSet<Laptop> listLaptop) {
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Укажите до какой цены вы хотите посмотреть ноутбуки:");
                Integer priceInput = sc.nextInt();
                boolean flaq1 = false;
                for (Laptop laptop : listLaptop) {
                    if (priceInput <= laptop.getPrice()) {
                        System.out.println(laptop.toString());
                        flaq1 = true;
                    }
                }
                if(flaq1 == false) {
                        System.out.println("Таких моделей нет");
                }
                break;
            case 2:
                System.out.println("Укажите количество оперативной памяти в Гб");
                boolean flaq2 = false;
                Integer ramInput = sc.nextInt();
                for (Laptop laptop : listLaptop) {
                    if (laptop.getRamSize().equals(ramInput)) {
                        System.out.println(laptop.toString());
                        flaq2 = true;
                    }
                }
                if (flaq2 == false) {
                        System.out.println("Таких моделей нет");
                    }
                break;
            case 3:
                System.out.println("Введите название опрерационной системы: ");
                sc.nextLine();
                String osInput = sc.nextLine().toLowerCase();
                boolean flaq3 = false;
                System.out.println(osInput);
                for (Laptop laptop : listLaptop) {
                    if (laptop.getOs().equals(osInput)) {
                        System.out.println(laptop.toString());
                        flaq3 = true;
                    }
                }
                if (flaq3 == false) {
                        System.out.println("Таких моделей нет");
                    }
        }
    }
}
