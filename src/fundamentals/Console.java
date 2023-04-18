package fundamentals;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Your name is: " + name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Avoid missing \n after nextInt

        System.out.printf("You are %d year old\n", age);

        input.close();
    }
}
