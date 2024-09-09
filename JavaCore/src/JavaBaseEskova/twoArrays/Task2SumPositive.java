package JavaBaseEskova.twoArrays;

import java.util.Random;
import java.util.Scanner;

public class Task2SumPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner("4 5 89");
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        Random rand = new Random(in.nextLong());

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(-10, 11);
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < arr[0].length; row++) {
            int sum = 0;
            for (int col = 0; col < arr.length; col++) {
                if (arr[col][row] > 0) sum += arr[col][row];
            }
            System.out.printf("%d ", sum);
        }
    }
}
