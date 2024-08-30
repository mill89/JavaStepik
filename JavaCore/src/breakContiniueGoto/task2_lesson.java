package breakContiniueGoto;

import java.util.Scanner;

public class task2_lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        while (a <= b) { //пока внутри диапазона
            boolean flag = true; //признак, что число a простое
            if (a == 1) flag = false; //единица не является простым
            for (int i = 2; i < a; i++) { //перебираем кандидатуры в делители
                if (a % i == 0) { //если a делится на i
                    flag = false; //сбрасываем флаг - число не простое
                    break; //далее перебирать делители нет смысла
                }
            }
            if (flag) { //если делители не найдены
                System.out.print(a + " ");
            }
            a++; //переход к следующему числу диапазона
        }
    }
}
