package exercises.classes;

public class DateUsage {

    public static void main(String[] args) {
        Date d1 = new Date(5, 5, 2023);

        Date d2 = new Date();

        System.out.printf("Day 1: %s\n", d1.getFormattedDate());
        System.out.printf("Day 2: %s\n", d2.getFormattedDate());
    }
}
