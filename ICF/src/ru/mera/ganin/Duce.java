package ru.mera.ganin;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Duce {
    public static void main(String[] args) {
        int[] Arr = {10, 4325, 100500, 21, 222, 1324, 21, 67};
        String ArrString = Arrays.toString(Arr);
        System.out.println(ArrString);
        int sum = 0;
        for (int num : Arr) {
            sum += num;
        }
        System.out.println("Сумма элементов массива " + sum);
        for (int i = 0; i < 8; i++) {
            if (i >= 1000)
                break;
        }
        System.out.println("Массив - массивный!");
        int max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (max < Arr[i])
                max = Arr[i];
        }
        System.out.println(max);
    }
}

