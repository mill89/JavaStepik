package JavaBaseEskova.breakContiniueGoto;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        boolean found = false;
        while (a <= b) {
            if (a > 1) {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        System.out.println(a);
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                break;
            }
            a++;
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}
