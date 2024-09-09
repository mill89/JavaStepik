package JavaBaseEskova.breakContiniueGoto;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner("8 11");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;

        while (a <= b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    sum += i;
                    break;
                }
            }
            a++;
        }
        System.out.println(sum);
    }
}
