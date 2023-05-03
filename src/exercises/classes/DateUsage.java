package exercises.classes;

public class DateUsage {

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.day = 3;
        d1.month = 5;
        d1.year = 2023;

        Date d2 = new Date();
        d2.day = 27;
        d2.month = 5;
        d2.year = 1998;

        System.out.printf("Day 1: %d/%d/%d\n", d1.day, d1.month, d1.year);
        System.out.printf("Day 2: %d/%d/%d\n", d2.day, d2.month, d2.year);
    }
}
