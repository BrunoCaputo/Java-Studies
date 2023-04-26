package control;

import java.util.Scanner;

public class BreakSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = input.nextInt();

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
                System.out.println("D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("E");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }

        input.close();
    }
}
