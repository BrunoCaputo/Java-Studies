package exercises.fundamentals;

import java.util.Scanner;

/**
 * Get the last three salaries using Scanner.
 * User can separate with , or .
 * Get the average value of the last three salaries
 */
public class ConversionChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first salary ");
        String n1 = input.nextLine().replaceAll(",", ".");
        System.out.print("Enter the second salary ");
        String n2 = input.nextLine().replaceAll(",", ".");
        System.out.print("Enter the third salary ");
        String n3 = input.nextLine().replaceAll(",", ".");

        double sum = Double.parseDouble(n1) + Double.parseDouble(n2) + Double.parseDouble(n3);
        double m = sum / 3;

        System.out.printf("The average of the last 3 salaries is R$%.2f\n", m);

        input.close();
    }
}
