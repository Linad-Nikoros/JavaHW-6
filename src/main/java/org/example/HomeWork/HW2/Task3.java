package org.example.HomeWork.HW2;
// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class Task3 {
    public static void main(String[] args) {
        ReplaceElement(GetArray(), CountSumIndex(GetArray()));
    }
    public static int[] GetArray() {
        int[] array1 = {10, -2, 3, 4, 8, -7, 65, -41, 8, 12, 1};
        return array1;
    }

    public static int CountSumIndex(int[] array) {

        int SumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(i)] >= 10 && array[Math.abs(i)] < 100) {
                SumIndex += i;
            }
        }
        return SumIndex;
    }

    public static void ReplaceElement(int array[], int SumIndex) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = SumIndex;

            }
            System.out.printf((array[i]) + " ");
        }

    }
}

