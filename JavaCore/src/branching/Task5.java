package branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner("42 10,5");
        int hours = in.nextInt();
        float rate = in.nextFloat();
        if (hours < 0 || rate < 0) {
            System.out.println("ERROR");
            return;
        }

        float salary;
        int h;
        if (hours <= 20) {
            salary = (float) hours * rate;
        } else if (hours <= 40) {
            h = hours - 20;
            salary = (float) 20 * rate;
            salary = (float) (salary + h * rate * 1.5);
        } else {
            h = hours - 40;
            salary = (float) 20 * rate;
            salary = (float) (salary + 20 * rate * 1.5);
            salary = salary + h * rate * 2;
        }

        System.out.printf("%.2f", salary);
    }
}
