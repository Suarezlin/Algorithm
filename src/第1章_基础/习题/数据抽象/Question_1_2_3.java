import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_2_3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] interval2d = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            interval2d[i] = new Interval2D(new Interval1D(StdRandom.uniform(0.0, 1.0) + StdRandom.uniform(min, max), StdRandom.uniform(0.0, 1.0) + StdRandom.uniform(min, max)), new Interval1D(StdRandom.uniform(0.0, 1.0) + StdRandom.uniform(min, max), StdRandom.uniform(0.0, 1.0) + StdRandom.uniform(min, max)));
        }
        int count_1 = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval2d[i].intersects(interval2d[j])) count_1++;
            }
        }
        int count_2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (interval2d[i].intersects(interval2d[j])) count_2++;
            }
        }
        StdOut.println(count_1);
        StdOut.println(count_2);
    }
}
