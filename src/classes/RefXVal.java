package classes;

import exercises.classes.Date;

public class RefXVal {

  public static void main(String[] args) {
    double a = 2;
    double b = a; // Value assignment -> by copy (Primitive Type)

    a++;
    b--;

    System.out.println(a);
    System.out.println(b);

    Date d1 = new Date(9, 5, 2023);
    Date d2 = d1; // Reference assignment (Object)

    d1.day = 31;
    d2.month = 12;

    System.out.println(d1.getFormattedDate());
    System.out.println(d2.getFormattedDate());

    backToDefaultDate(d1);

    System.out.println(d1.getFormattedDate());
    System.out.println(d2.getFormattedDate());

    int c = 5;
    changePrimitive(c);
    System.out.println(c);
  }

  static void backToDefaultDate(Date d) {
    d.day = 1;
    d.month = 1;
    d.year = 1970;
  }

  static void changePrimitive(int a) {
    a++;
  }
}
