package JavaBaseEskova.cycle;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner("17 2 3 4 9 -1");
        int control_num = in.nextInt();
        int div = 0;
        int num = in.nextInt();
        do {
            if (control_num % num == 0) div++;
            num = in.nextInt();
        } while (num > 0);
        System.out.println(div);
    }
}
