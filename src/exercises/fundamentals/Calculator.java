package exercises.fundamentals;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter with the first number: ");
        double n1 = Double.parseDouble(input.nextLine().replaceAll(",", "."));

        System.out.print("Enter with the second number: ");
        double n2 = Double.parseDouble(input.nextLine().replaceAll(",", "."));

        System.out.print("Select the operator (+ - / *): ");
        String operator = input.nextLine().trim();

        String result = "+=/*".contains(operator)
                ? "Result: " +
                (operator.equals("+")
                        ? (n1 + n2)
                        : operator.equals("-")
                        ? (n1 - n2)
                        : operator.equals("*")
                        ? (n1 * n2)
                        : (n1 / n2)
                )
                : "Invalid operation";
        System.out.println(result);

        input.close();
    }
}
