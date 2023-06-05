package exercises.collections;

import java.util.Scanner;

public class ArrayChallenge {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many grades do you want to enter? ");
    int gradeLen = input.nextInt();

    double[] grades = new double[gradeLen];

    for (int i = 0; i < gradeLen; i++) {
      System.out.printf("Enter the %d grade: ", i + 1);
      String strGrade = input.next().replaceAll(",", ".");
      grades[i] = Double.parseDouble(strGrade);
    }

    double total = 0.0;

    for (double grade : grades) {
      total += grade;
    }

    double avg = total / grades.length;
    System.out.printf("The average grade is %.2f\n", avg);

    input.close();
  }
}
