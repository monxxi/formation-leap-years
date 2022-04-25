package tdd.kata;

public class Years {

    public static boolean isLeapYear(int year) {
        if (isDivisibleBy(400, year)) {
            return true;
        }

        if (isDivisibleBy(100, year)) {
            return false;
        }

        return isDivisibleBy(4, year);
    }

    private static boolean isDivisibleBy(int divideBy, int year) {
        return year % divideBy == 0;
    }

}
