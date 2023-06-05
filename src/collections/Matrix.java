package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many students? ");
    int studentsQtt = input.nextInt();

    System.out.print("How many grades per student? ");
    int gradesQtt = input.nextInt();

    double[][] classGrades = new double[studentsQtt][gradesQtt];

    double total = 0;
    for (int s = 0; s < classGrades.length; s++) {
      for (int g = 0; g < classGrades[s].length; g++) {
        System.out.printf("Enter de %d grade for the %d student: ", g + 1, s + 1);
        String strGrade = input.next().replaceAll(",", ".");
        double grade = Double.parseDouble(strGrade);
        classGrades[s][g] = grade;
        total += grade;
      }
    }

    double avg = total / (studentsQtt * gradesQtt);
    System.out.printf("The class average grade is %.2f\n", avg);

    int index = 1;
    for (double[] studentGrades : classGrades) {
      System.out.printf("Student %d grades: %s\n", index++, Arrays.toString(studentGrades));
    }

    input.close();
  }
}
