import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_19 {
    public static void main(String[] args) {
        Date1 date = new Date1("12/4/2017");
        StdOut.println(date.toString());
    }
}

class Date1 {
    private final int month;
    private final int day;
    private final int year;

    public Date1(int m, int d, int y) {
        isIllegalDate(m, d, y);
        day = d;
        month = m;
        year = y;
    }

    public Date1(String date) {
        String[] field = date.split("/");
        int m = Integer.parseInt(field[0]);
        int d = Integer.parseInt(field[1]);
        int y = Integer.parseInt(field[2]);
        isIllegalDate(m, d, y);
        day = d;
        month = m;
        year = y;
    }

    public void isIllegalDate(int m, int d, int y) {
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
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
