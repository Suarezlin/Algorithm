import edu.princeton.cs.algs4.StdOut;

import java.util.Date;

public class Question_1_2_13 {
    private final String custom;
    private final Date date;
    private final double money;

    public Question_1_2_13(String c, Date d, double m) {
        custom = c;
        date = d;
        money = m;
    }

    public String custom() {
        return custom;
    }

    public Date date() {
        return date;
    }

    public double money() {
        return money;
    }

    public String toString() {
        return custom + " " + date.toString() + " " + String.valueOf(money);
    }

    public boolean equal(Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        Question_1_2_13 x = (Question_1_2_13) that;
        if (this.custom != x.custom) return false;
        if (!this.date.equals(x.date)) return false;
        if (this.money != x.money) return false;
        return true;
    }

    public static void main(String[] args) {
        Question_1_2_13 transaction1 = new Question_1_2_13("Suarezlin", new Date(2017, 12, 3), 19.99);
        StdOut.println(transaction1.toString());
        Question_1_2_13 transaction2 = new Question_1_2_13("Suarezln", new Date(2017, 12, 3), 19.99);
        StdOut.println(transaction2.toString());
        StdOut.println(transaction1.equal(transaction2));
    }
}
