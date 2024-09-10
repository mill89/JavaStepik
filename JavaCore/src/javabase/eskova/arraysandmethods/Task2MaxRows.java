package javabase.eskova.arraysandmethods;

import java.util.Random;
import java.util.Scanner;

public class Task2MaxRows {
    public static void main(String[] args) {
        Scanner scan = new Scanner("3 4 88");
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(array, seed);
        printArray(array);
        System.out.println();
        printMaxIndex(array);
    }

    static void initArray(int[][] arr, long seed) {
        Random rand = new Random(seed);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(11);
            }
        }

    }

    static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println();
        }
    }

    static void printMaxIndex(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int max = 0;
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > arr[row][max]) max = col;
            }
            System.out.printf("%d ", max);
        }
    }
}
