package javabase.eskova.arraysandmethods;

import java.util.Random;
import java.util.Scanner;

public class Task4RemoveRow {
    public static void main(String[] args) {
        Scanner scan = new Scanner("3 2 155 3");
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
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

    static int[][] deleteRow(int[][] arr, int indx) {
        if (indx < 0 || indx >= arr.length) return arr;
        int[][] nArr = new int[arr.length - 1][arr[0].length];

        for (int row = 0; row < indx; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                nArr[row][col] = arr[row][col];
            }
        }
        for (int row = indx; row < nArr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                nArr[row][col] = arr[row + 1][col];
            }
        }
        return nArr;
    }
}
