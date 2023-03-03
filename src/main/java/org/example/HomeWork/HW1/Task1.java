package org.example.HomeWork.HW1;

public class Task1 {
    public static void main(String[] args) {

        String str = "He went for a walk";

        String temp[] = str.split(" ");

        String result = "";

        for (int i = temp.length-1; i >= 0; i--) {
            result = result + temp[i] + " ";
        }

        System.out.println(result);
    }

}
