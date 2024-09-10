package javabase.eskova.debug;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner("6 7 6 -1");
        int grade, k = 0, sum = 0;
        double sred;
        grade = scan.nextInt();
        while (grade >= 0) {
            k++;
            sum += grade;
            grade = scan.nextInt();
        }
        if (k > 0) {
            sred = (double) sum / k;
            System.out.printf("%.1f", sred);
        } else {
            System.out.println("No data");
        }
    }
}