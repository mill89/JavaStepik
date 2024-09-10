package javabase.eskova.twoarrays;

import java.util.Random;
import java.util.Scanner;

public class Task3NegativeIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner("3 2 170");
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        Random rand = new Random(in.nextLong());

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(-10, 11);
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println();
        }

        a: for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] < 0) {
                    System.out.println(col);
                    continue a;
                }
            }
            System.out.println("NO");
        }
    }
}
