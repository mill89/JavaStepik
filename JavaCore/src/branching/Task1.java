package branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner("3,5 -1,5 2 4,8");
//        Scanner scan = new Scanner("2,2 -4,1 4,1 2,2");
        float x1 = scan.nextFloat();
        float y1 = scan.nextFloat();
        float x2 = scan.nextFloat();
        float y2 = scan.nextFloat();

        float d1;
        d1 = (float) Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        float d2;
        d2 = (float) Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (d1 == d2) {
            System.out.println("Точки на равных расстояниях");
        } else if (d1 < d2) {
            System.out.println("Первая точка ближе");
        } else {
            System.out.println("Вторая точка ближе");
        }
    }
}
