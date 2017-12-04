public class Question_1_2_18 {

}

class Accumulator {
    private double m;
    private double s;
    private int N;

    public void addDateValue(double x) {
        N++;
        s += 1.0 * (N - 1) / N * (x - m) * (x - m);
        m += (x - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(var());
    }
}
