import edu.princeton.cs.algs4.StdOut;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int day() {
        return day;
    }

    public int month() {
        return month;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public static void main(String[] args) {
        Date date = new Date(12, 1, 2017);
        StdOut.println(date);
    }
}
