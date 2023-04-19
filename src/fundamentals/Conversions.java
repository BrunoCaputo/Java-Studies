package fundamentals;

import javax.swing.*;

public class Conversions {

    public static void main(String[] args) {
        // Number to String
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = num1;
        System.out.println(Integer.toString(num2));

        // Other way conversion
        System.out.println("" + num1);
        System.out.println("" + num2);

        // String to Number
        String val1 = JOptionPane.showInputDialog("Enter the first number");
        String val2 = JOptionPane.showInputDialog("Enter the second number");

        // String concat
        System.out.println(val1 + val2);

        double n1 = Double.parseDouble(val1);
        double n2 = Double.parseDouble(val2);

        double sum = n1 + n2;

        System.out.println("SUM: " + sum);
        System.out.println("AVG: " + (sum / 2));
    }
}
