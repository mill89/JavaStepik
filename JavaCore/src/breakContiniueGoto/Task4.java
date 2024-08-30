package breakContiniueGoto;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 2; i < num; i++) {
            int n = num % i == 0 ? num / i : 0;
            if (n != 0 && n % 2 == 0) sum += n;
        }
        System.out.println(sum);
    }
}
