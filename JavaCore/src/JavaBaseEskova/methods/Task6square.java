package JavaBaseEskova.methods;

import java.util.Scanner;

public class Task6square {
    public static void main(String[] args) {
        Scanner in = new Scanner("1 5,5"); // 30.25
        double res = 0;
        switch (in.nextInt()) {
            case 1 -> res = square(in.nextDouble());
            case 2 -> res = square(in.nextDouble(), in.nextDouble());
        }
        System.out.printf("%.2f", res);
    }

    static double square(double a) {
        return a * a;
    }

    static double square(double a, double b) {
        return a * b;
    }
}
