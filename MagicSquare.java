package com.alevel.Homework;

public class MagicSquare {

    public static void main(String[] args) {
        System.out.println(isMagicSquare(new int[][]{
                {6, 1, 8},
                {7, 5, 3},
                {2, 9, 4},
        }));

    }

    public static Boolean isMagicSquare(int[][] array) {
        int side = array.length;
        int num = 0;
        for (int x = 0; x < side; ++x) {
            num += array[0][x];
        }
        int sumD = 0;
        for (int x = 0; x < side; ++x) {
            int sumX = 0;
            int sumY = 0;
            for (int y = 0; y < side; ++y) {
                sumX += array[x][y];
                sumY += array[y][x];
            }
            sumD += array[x][x];
            if (sumX != num || sumY != num) {
                return false;
            }
        }
        return sumD == num;
    }
}
