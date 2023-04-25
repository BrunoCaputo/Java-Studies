package control;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        double grade = input.nextDouble();

        if (grade >= 7) {
            System.out.println("Approved!");
            System.out.println("Congratulations!");
        }
        if (grade < 7 && grade >= 4.5) {
            System.out.println("Summer School");
        }
        if (grade < 4.5 && grade >= 0) {
            System.out.println("Reproved");
        }

        input.close();
    }
}
