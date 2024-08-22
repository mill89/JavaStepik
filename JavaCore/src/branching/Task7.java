package branching;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner("Понедельник");
        String day = switch (in.next().toLowerCase()) {
            case "понедельник" -> "Monday";
            case "вторник" -> "Tuesday";
            case "среда" -> "Wednesday";
            case "четверг" -> "Thursday";
            case "пятница" -> "Friday";
            case "суббота" -> "Saturday";
            case "воскресенье" -> "Sunday";
            default -> "ERROR";
        };
        System.out.println(day);
    }
}
