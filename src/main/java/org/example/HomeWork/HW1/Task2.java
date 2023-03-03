package org.example.HomeWork.HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num1 = scanner.nextInt();
        while (num1 != 0) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }

        System.out.printf("Сумма равна:" + sum);
    }

}


