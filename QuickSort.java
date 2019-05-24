package com.alevel.Homework;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] array = {55, 1, 33, 6, 5, 1, 46, 2, 1, 2, 6, 49};
        System.out.println(Arrays.toString(array));
        boolean iteration = true;
        while (iteration) {
            iteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    iteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
