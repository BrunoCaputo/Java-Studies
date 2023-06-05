package collections;

public class Foreach {
  public static void main(String[] args) {
    double[] grades = {9.9, 8.7, 7.2, 9.4};

    for (int i = 0; i < grades.length; i++) {
      System.out.println(grades[i]);
    }

    for (double grade : grades) {
      System.out.println(grade);
    }
  }
}
