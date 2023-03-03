package org.example.HomeWork.HW2;

import java.util.Scanner;

public class Task1 {

    public static boolean CheckPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num1 = scanner.nextInt();
        while (num1 != 0) {
            int num2 = scanner.nextInt();
            if (CheckPrimeNumber(num1) == true) {
                sum += num1;
            }
            num1 = num2;
        }
        System.out.printf("Сумма равна:" + sum);
    }

}
