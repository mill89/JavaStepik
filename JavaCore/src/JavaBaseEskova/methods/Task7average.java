package JavaBaseEskova.methods;

import java.util.Scanner;

public class Task7average {
    public static void main(String[] args) {
        Scanner scan = new Scanner("3 4 8 7,2 0,3 4,8"); //3.50 5.00 3.75 4.10
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y), average(x, y, z));
    }

    static double average(double a, double b) {
        return (a + b) / 2;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
