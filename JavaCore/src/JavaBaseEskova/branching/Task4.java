package JavaBaseEskova.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner("3 77 9 60 13");
//        int min = in.nextInt();
//        int num;
//        for (int i = 1; i < 5; i++) {
//            min = Math.min(in.nextInt(), min);
//        }
//        System.out.println(min);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int f = in.nextInt();
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (f < min) min = f;

        System.out.println(min);
    }
}
