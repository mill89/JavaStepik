package methods;

import java.util.Scanner;

public class Task5PrintTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner("3 *");
        int weight = scan.nextInt();
        String str = scan.next();
        char sim = str.charAt(0);
        printTriangle(weight, sim);

    }

    static void printTriangle(int weight, char sim) {
        int increment = (weight % 2 == 0) ? 2 : 1; // Начинаем с двух символов на первой строке

        // Цикл для каждой строки треугольника
        while (increment <= weight) {
            // Печатаем пробелы перед символами для центрирования
            for (int j = 0; j < (weight - increment) / 2; j++) {
                System.out.print(" ");
            }

            // Печатаем символы
            for (int j = 0; j < increment; j++) {
                System.out.print(sim);
            }

            // Переход на следующую строку
            System.out.println();

            // Увеличиваем количество символов для следующей строки на 2
            increment += 2;
        }
    }
}

