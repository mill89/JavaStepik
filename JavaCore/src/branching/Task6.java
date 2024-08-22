package branching;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final int FuelTANK = 300;
        Scanner in = new Scanner("136 268 400");
        int ab = in.nextInt();
        int bc = in.nextInt();
        int weight = in.nextInt();

        double consumption = 1;
        if (weight > 500) {
            consumption = 4;
        } else if (weight > 1000) {
            consumption = 7;
        } else if (weight > 1500) {
            consumption = 9;
        } else if (weight > 2000) {
            System.out.println("ERROR");
            return;
        }

        double abConsumption = ab * consumption;
        double bcConsumption = bc * consumption;
        double remainder;
        if (FuelTANK - abConsumption < 0 || FuelTANK - bcConsumption < 0) {
            System.out.println("ERROR");
            return;
        } else {
            remainder = bcConsumption - (FuelTANK - abConsumption);
            if (remainder < 0) remainder = 0;

            System.out.printf("%.2f", remainder);
        }

    }
}

