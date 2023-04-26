package control;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "";
        do {
            System.out.println("Enter the magic words...");
            System.out.println("Exit? ");
            text = input.nextLine();
        } while (!text.equalsIgnoreCase("exit"));

        input.close();
    }
}
