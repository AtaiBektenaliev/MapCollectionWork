import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> week = new HashMap<>();

        week.put("Monday", "Понедельник");
        week.put("Tuesday", "Вторник");
        week.put("Wednesday", "Среда");
        week.put("Thursday", "Четверг");
        week.put("Friday", "Пятница");
        week.put("Saturday", "Суббота");
        week.put("Sunday", "Воскресенье");

        String key1 = week.get("Monday");
        String key2 = week.get("Tuesday");
        String key3 = week.get("Wednesday");
        String key4 = week.get("Thursday");
        String key5 = week.get("Friday");
        String key6 = week.get("Saturday");
        String key7 = week.get("Sunday");

        System.out.println("Write the day of the week: ");
        String weekday = sc.nextLine();

        switch (weekday) {
            case "Monday" -> System.out.println("Перевод на русский: " + key1);
            case "Tuesday" -> System.out.println("Перевод на русский: " + key2);
            case "Wednesday" -> System.out.println("Перевод на русский: " + key3);
            case "Thursday" -> System.out.println("Перевод на русский: " + key4);
            case "Friday" -> System.out.println("Перевод на русский: " + key5);
            case "Saturday" -> System.out.println("Перевод на русский: " + key6);
            case "Sunday" -> System.out.println("Перевод на русский: " + key7);
            default -> System.out.println("There is no such day of the week.");
        }
    }
}

