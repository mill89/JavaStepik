package JavaBaseEskova.twoArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1MaxCount {
    public static void main(String[] args) {
        Scanner in = new Scanner("5 7 22");
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        Random rand = new Random(in.nextLong());

        //  заполнение и сразу вывод
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(-5, 5);
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println();
        }

        int max = arr[0][0];
        int countMax = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == max) countMax++; // считаем максимальное число
                if (arr[row][col] > max) {
                    max = arr[row][col]; // обновляем макс. число, начинаем считать сначала
                    countMax = 1;
                }
            }
        }

        System.out.printf("%d %d", max, countMax);
    }
}
