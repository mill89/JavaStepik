package branching;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String d;
        if (day > 0 && day < 6) {
            d = "Working day";
        } else if (day == 6) {
            d = "Saturday";
        } else if (day == 7) {
            d = "Sunday";
        } else {
            d = "ERROR";
        }

        System.out.println(d);
    }
}
