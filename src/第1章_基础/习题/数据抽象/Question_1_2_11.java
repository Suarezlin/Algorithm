import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_11 {
    private final int day;
    private final int month;
    private final int year;

    public Question_1_2_11(int d, int m, int y) {
        if (m <= 0 && m > 12) throw new RuntimeException("illegal date");
        if (m <= 7 && m % 2 != 0) {
            if (d > 31 || d <= 0) throw new RuntimeException("illegal date");
        }
        else if (m == 2) {
            if (y % 4 == 0 && y % 400 != 0) {
                if (d > 29 || d < 0) throw new RuntimeException("illegal date");
            }
            else {
                if (d > 28 || d < 0) throw new RuntimeException("illegal date");
            }
        }
        else if (m > 7 && m % 2 == 0) {
            if (d > 31 || d <= 0) throw new RuntimeException("illegal date");
        }
        else if (m <= 7 && m % 2 == 0) {
            if (d > 30 || d <= 0) throw new RuntimeException("illegal date");
        }
        else if (m > 7 && m % 2 != 0) {
            if (d > 30 || d <= 0) throw new RuntimeException("illegal date");
        }
        day = d;
        month = m;
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
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        Question_1_2_11 date = new Question_1_2_11(28, 2, 2017);
        StdOut.println(date.toString());
    }
}
