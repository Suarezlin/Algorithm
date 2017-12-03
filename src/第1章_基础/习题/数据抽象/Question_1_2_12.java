import edu.princeton.cs.algs4.StdOut;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question_1_2_12 {
    private final int day;
    private final int month;
    private final int year;

    public Question_1_2_12(int d, int m, int y) {
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

    public String dayOfTheWeek() {
        String[] weeks = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dddd");// 定义日期格式
        Date date = null;
        String dateStr = toString();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if(week_index<0){
            week_index = 0;
        }
        return weeks[week_index];
    }

    public static void main(String[] args) {
        Question_1_2_12 date = new Question_1_2_12(28, 2, 2017);
        StdOut.println(date.toString());
    }
}
