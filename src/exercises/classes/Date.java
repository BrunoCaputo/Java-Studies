package exercises.classes;

public class Date {
  public int day;
  public int month;
  public int year;

  Date() {
    //  day = 1;
    //  month = 1;
    //  year = 1970;
    this(1, 1, 1970);
  }

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getFormattedDate() {
    final String format = "%d/%d/%d"; // Local variable
    return String.format(format, day, month, year);
  }
}
