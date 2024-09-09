package JavaBaseEskova.cycle;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner("8 5 8 9 3 2 7 18 33");
        int quantity = in.nextInt();
        int min = in.nextInt();
        for (int i = 2; i <= quantity; i++) {
            int n = in.nextInt();
            min = n < min ? n : min;
        }
        System.out.println(min);
    }
}
