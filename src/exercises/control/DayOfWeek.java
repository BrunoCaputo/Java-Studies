package exercises.control;

import java.util.Scanner;

/**
 * If and Else Exercise <br>
 * Sunday -> 1 <br>
 * Monday -> 2 <br>
 * Tuesday -> 3 <br>
 * Wednesday -> 4 <br>
 * Thursday -> 5 <br>
 * Friday -> 6 <br>
 * Saturday -> 7
 */
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayNum = 0;

        System.out.print("Enter the day of week: ");
        String dayOfWeek = input.nextLine().trim().toLowerCase();

        if (dayOfWeek.equals("sunday")) {
            dayNum = 1;
        } else if (dayOfWeek.equals("monday")) {
            dayNum = 2;
        } else if (dayOfWeek.equals("tuesday")) {
            dayNum = 3;
        } else if (dayOfWeek.equals("wednesday")) {
            dayNum = 4;
        } else if (dayOfWeek.equals("thursday")) {
            dayNum = 5;
        } else if (dayOfWeek.equals("friday")) {
            dayNum = 6;
        } else if (dayOfWeek.equals("saturday")) {
            dayNum = 7;
        }

        System.out.printf("Day: %d\n", dayNum);
        input.close();
    }
}
