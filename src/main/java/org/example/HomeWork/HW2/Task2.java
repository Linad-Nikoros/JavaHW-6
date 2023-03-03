package org.example.HomeWork.HW2;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Flag = false;
        int num1 = scanner.nextInt();
        while (true) {
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                break;
            }
            if (num1 >= num2 ) {
                Flag = true;
                System.out.printf("Последовательность не возрастающая");
                break;
            }

            num1 = num2;
        }
        if (Flag == false) {
            System.out.printf("Последовательность возростающая" );
        }

    }


}
