package control;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Enter a number:");
        int num = Integer.parseInt(value);

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Other option
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
