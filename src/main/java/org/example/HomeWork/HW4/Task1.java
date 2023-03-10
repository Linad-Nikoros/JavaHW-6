//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
package org.example.HomeWork.HW4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        Deque<Integer> List = new LinkedList<>();

        for (int i = 0; i <= n; i++){
           System.out.println("Введите "+ i + " элемент списка");
           int item = scanner.nextInt();
           List.add(item);
        }

        for (int i = 0; i <= n; i++) {
           System.out.printf(List.pollLast() + " ");
        }
    }
}


