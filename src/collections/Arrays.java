package collections;

public class Arrays {

  public static void main(String[] args) {
    double[] student1Grades = new double[4];
    student1Grades[0] = 7.9;
    student1Grades[1] = 8;
    student1Grades[2] = 6.7;
    student1Grades[3] = 9.7;

    String stringArray = java.util.Arrays.toString(student1Grades);
    System.out.println(stringArray);

    double student1Total = 0;
    for (int i = 0; i < student1Grades.length; i++) {
      student1Total += student1Grades[i];
    }
    System.out.println(student1Total / student1Grades.length);

    double[] student2Grades = {6.9, 8.9, 5.5, 10};

    double student2Total = 0;
    for (int i = 0; i < student2Grades.length; i++) {
      student2Total += student2Grades[i];
    }

    System.out.println(student2Total / student2Grades.length);
  }
}
