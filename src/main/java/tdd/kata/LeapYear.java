package tdd.kata;

public class LeapYear {

    public static boolean isLeapYear(int year) {
      return year % 400 == 0 || year % 4 == 0;
    }
}
