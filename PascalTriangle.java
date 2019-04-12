package com.alevel.Homework;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество строк: ");
        int inputNum = in.nextInt();
        getTriangle(inputNum);
    }

    public static int getTriangle(int numberOfRows) {
        int a, num;

        for (int i = 0; i <= numberOfRows - 1; i++) {
            num = 1;
            a = i + 1;

            for (int j = numberOfRows - 1; j > 0; j--) {    //этот цикл нужен для отображения "ёлкой"
                if (j > i)
                    System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j > 0)
                    num = num * (a - j) / j;

                System.out.print(num + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
