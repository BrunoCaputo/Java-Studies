package exercises.control;

import java.util.Scanner;

public class WhileChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade;
        double allGrades = 0;
        double avg;
        int gradeQtt = 0;
        do {
            System.out.print("Enter the grade (-1 to exit): ");
            grade = input.nextDouble();

            if (grade >= 0 && grade <= 10) {
                // Valid grade
                allGrades += grade;
                gradeQtt++;
            } else if (grade != -1) {
                // Ivalid grade
                System.out.println("Invalid grade");
            }
        } while (grade != -1);

        avg = allGrades / gradeQtt;

        System.out.printf("The average grade is %.2f\n", Double.isNaN(avg) ? 0 : avg);

        input.close();
    }
}
